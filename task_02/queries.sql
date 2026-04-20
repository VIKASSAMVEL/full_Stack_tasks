-- Task 2: Data Retrieval & Sorting Dashboard
USE college_db;

-- Sorting by name
SELECT * FROM students ORDER BY name ASC;

-- Sorting by Date of Birth
SELECT * FROM students ORDER BY dob DESC;

-- Filtering by department
SELECT * FROM students WHERE department = 'CSE';

-- Count students per department
SELECT department, COUNT(*) as student_count 
FROM students 
GROUP BY department;
