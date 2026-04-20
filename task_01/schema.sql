-- Task 1: Student Registration & Data Storage
CREATE DATABASE IF NOT EXISTS college_db;
USE college_db;

CREATE TABLE IF NOT EXISTS students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    dob DATE NOT NULL,
    department VARCHAR(50) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Sample Insert
INSERT INTO students (name, email, dob, department, phone) 
VALUES ('John Doe', 'john.doe@example.com', '2004-05-15', 'CSE', '9876543210');

-- Retrieval Query
SELECT * FROM students;
