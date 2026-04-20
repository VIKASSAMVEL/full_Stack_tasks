-- Task 4: Order Management using Joins
USE college_db;

-- Creation of Tables
CREATE TABLE IF NOT EXISTS customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(100),
    city VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    order_date DATE,
    amount DECIMAL(10,2),
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

CREATE TABLE IF NOT EXISTS products (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100),
    price DECIMAL(10,2)
);

-- Sample Data
INSERT INTO customers VALUES (1, 'Alice', 'New York'), (2, 'Bob', 'London');
INSERT INTO orders VALUES (101, 1, '2026-04-01', 5000.00), (102, 1, '2026-04-05', 1200.00), (103, 2, '2026-04-10', 800.00);

-- Display Order History with Joins
SELECT c.customer_name, o.order_id, o.order_date, o.amount
FROM customers c
JOIN orders o ON c.customer_id = o.customer_id;

-- Subquery to find Highest Value Order
SELECT * FROM orders 
WHERE amount = (SELECT MAX(amount) FROM orders);

-- Subquery to find most active customer (most orders)
SELECT customer_name FROM customers
WHERE customer_id = (
    SELECT customer_id FROM orders 
    GROUP BY customer_id 
    ORDER BY COUNT(*) DESC LIMIT 1
);
