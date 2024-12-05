package com.springboot.project.service;

import com.springboot.project.exception.StudentAlreadyExistsException;
import com.springboot.project.exception.StudentNotFoundException;
import com.springboot.project.model.Student;
import com.springboot.project.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService{

    private final StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student addStudent(Student student) {
        if(studentAlreadyExists(student.getEmail())) {
            throw new StudentAlreadyExistsException( student.getEmail() + " already exists");
        }

        return studentRepository.save(student);
    }

    private boolean studentAlreadyExists(String email) {
        return studentRepository.findByEmail(email).isPresent();
    }

    @Override
    public Student updateStudent(Student student , Long id) {
        return studentRepository.findById(id).map(st -> {
            st.setFirstName(student.getFirstName());
            st.setLastName(student.getLastName());
            st.setEmail(student.getEmail());
            st.setDepartment(student.getDepartment());
            return studentRepository.save(st);
        }).orElseThrow(() -> new StudentNotFoundException("This student could not be found "));
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).
                orElseThrow(() ->
                        new StudentNotFoundException("Student not found with the id " + id));
    }

    @Override
    public void deleteStudent(Long id) {
        if(//studentRepository.findById(id).isPresent())  -> another method
           !studentRepository.existsById(id)) {
            throw new StudentNotFoundException("Student not found");
        }
        studentRepository.deleteById(id);
    }
}
