import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';

const Home = () => {
  return (
    <div className="container-fluid vh-100 d-flex justify-content-center align-items-center p-0" style={{ backgroundColor: '#d3d3d3', marginTop: '-10px' }}>
      <div className="card shadow-sm" style={{ maxWidth: '800px', width: '100%', marginTop: '0' }}>
        {/* Title Section */}
        <div className="card-body text-center">
          <h1 className="display-4 font-weight-bold text-dark mb-4">Welcome to the Student Manager App</h1>
          
          {/* Description Section */}
          <p className="lead text-secondary mb-4">
            The <strong>Student Manager App</strong> is a simple, easy-to-use application designed to manage student records effectively. 
            You can add new students, view the list of all students, and manage their information such as first name, last name, email, and department. 
            This app aims to streamline student management tasks and provide a clear interface for easy data handling.
          </p>

          {/* Key Features Section */}
          <div className="text-center">
            <h3 className="font-weight-bold mb-4">Key Features:</h3>
            <ul className="list-unstyled">
              <li className="d-flex justify-content-center align-items-center mb-3">
                <span role="img" aria-label="search" className="mr-2">🔍</span>
                <strong>View All Students</strong>
              </li>
              <li className="d-flex justify-content-center align-items-center mb-3">
                <span role="img" aria-label="add" className="mr-2">➕</span>
                <strong>Add New Students</strong>
              </li>
              <li className="d-flex justify-content-center align-items-center mb-3">
                <span role="img" aria-label="edit" className="mr-2">✏️</span>
                <strong>Update Student Information</strong>
              </li>
              <li className="d-flex justify-content-center align-items-center mb-3">
                <span role="img" aria-label="delete" className="mr-2">🗑️</span>
                <strong>Delete Student Records</strong>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Home;
