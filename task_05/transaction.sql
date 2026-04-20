-- Task 5: Transaction-Based Payment Simulation
USE college_db;

CREATE TABLE IF NOT EXISTS accounts (
    acc_id INT PRIMARY KEY,
    acc_holder VARCHAR(50),
    balance DECIMAL(15,2)
);

-- Initial Balances
INSERT INTO accounts VALUES (1, 'User A', 10000.00), (2, 'Merchant X', 5000.00);

-- Payment Simulation Procedure (Conceptual)
-- 1. Deduct from User
-- 2. Add to Merchant
-- 3. Check for errors
-- 4. COMMIT or ROLLBACK

-- Scenario 1: Successful Transaction
START TRANSACTION;
UPDATE accounts SET balance = balance - 2000.00 WHERE acc_id = 1;
UPDATE accounts SET balance = balance + 2000.00 WHERE acc_id = 2;
COMMIT;
SELECT 'Transaction Successful' as Status, balance FROM accounts WHERE acc_id = 1;

-- Scenario 2: Failed Transaction (Simulation of ROLLBACK)
-- Suppose User A tries to send 50000.00 but only has 8000.00 left
START TRANSACTION;
UPDATE accounts SET balance = balance - 50000.00 WHERE acc_id = 1;

-- Check balance (Conceptual check in script)
-- Since balance would go negative (-42000), we ROLLBACK
ROLLBACK;

SELECT 'Transaction Failed & Rolled Back' as Status, balance FROM accounts WHERE acc_id = 1;
