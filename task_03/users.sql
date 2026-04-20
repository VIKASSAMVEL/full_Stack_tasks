-- Task 3: Login System with Validation
USE college_db;

CREATE TABLE IF NOT EXISTS users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(20) DEFAULT 'USER'
);

-- Sample Credentials (password should be hashed in real apps)
INSERT INTO users (username, password, role) 
VALUES ('admin@college.edu', 'admin123', 'ADMIN');

INSERT INTO users (username, password, role) 
VALUES ('student@college.edu', 'student123', 'STUDENT');

-- Retrieval Query for validation
SELECT * FROM users WHERE username = 'admin@college.edu' AND password = 'admin123';
