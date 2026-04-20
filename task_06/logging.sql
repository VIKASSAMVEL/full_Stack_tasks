-- Task 6: Automated Logging using Triggers & Views
USE college_db;

-- 1. Create Log Table
CREATE TABLE IF NOT EXISTS activity_logs (
    log_id INT AUTO_INCREMENT PRIMARY KEY,
    table_name VARCHAR(50),
    action VARCHAR(20),
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 2. Create Trigger for Insert
DELIMITER //
CREATE TRIGGER student_insert_trigger
AFTER INSERT ON students
FOR EACH ROW
BEGIN
    INSERT INTO activity_logs (table_name, action) VALUES ('students', 'INSERT');
END //
DELIMITER ;

-- 3. Create Trigger for Update
DELIMITER //
CREATE TRIGGER student_update_trigger
AFTER UPDATE ON students
FOR EACH ROW
BEGIN
    INSERT INTO activity_logs (table_name, action) VALUES ('students', 'UPDATE');
END //
DELIMITER ;

-- 4. Create View for Daily Activity Report
CREATE OR REPLACE VIEW daily_activity_report AS
SELECT DATE(timestamp) as activity_date, action, COUNT(*) as action_count
FROM activity_logs
GROUP BY activity_date, action;

-- Test the triggers
INSERT INTO students (name, email, dob, department, phone) 
VALUES ('Jane Smith', 'jane.smith@example.com', '2005-09-12', 'ECE', '8888877777');

-- Check logs and view
SELECT * FROM activity_logs;
SELECT * FROM daily_activity_report;
