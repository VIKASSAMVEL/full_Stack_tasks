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

START TRANSACTION;

UPDATE accounts SET balance = balance - 2000.00 WHERE acc_id = 1;

-- Simulate error check (if balance < 0 then ROLLBACK)
-- SELECT balance into @bal FROM accounts WHERE acc_id = 1;
-- IF @bal < 0 THEN ROLLBACK; ELSE

UPDATE accounts SET balance = balance + 2000.00 WHERE acc_id = 2;

-- If all good
COMMIT;

-- Verify final state
SELECT * FROM accounts;
