CREATE TABLE products (
    product_id SERIAL PRIMARY KEY,
    product_name TEXT,
	price DECIMAL(10,2),
    stock_quantity INT
);
CREATE TABLE customers (
    customer_id SERIAL PRIMARY KEY,
    first_name TEXT,
	last_name TEXT,
	email TEXT UNIQUE NOT NULL
);
CREATE TABLE orders (
    order_id SERIAL PRIMARY KEY,
    customer_id INT REFERENCES customers(customer_id),
    order_date DATE
);
CREATE TABLE order_items (
    order_id INT REFERENCES orders(order_id),
    product_id INT REFERENCES products(product_id),
    quantity INT,
    PRIMARY KEY (order_id, product_id)
);
INSERT INTO products (product_name, price, stock_quantity) VALUES
('Laptop', 999.99, 10),
('Smartphone', 599.99, 15),
('Headphones', 199.99, 30),
('Keyboard', 49.99, 25),
('Mouse', 29.99, 50);
INSERT INTO customers (first_name, last_name, email) VALUES
('Alice', 'Anderson', 'alice.anderson@example.com'),
('Bob', 'Brown', 'bob.brown@example.com'),
('Charlie', 'Clark', 'charlie.clark@example.com'),
('Dana', 'Davis', 'dana.davis@example.com');
INSERT INTO orders (customer_id, order_date) VALUES
(1, '2023-10-01'),
(2, '2023-10-02'),
(3, '2023-10-03'),
(4, '2023-10-04'),
(1, '2023-10-05'),
(3, '2023-10-08'),
(4, '2023-10-12');
INSERT INTO order_items (order_id, product_id, quantity) VALUES
(1, 1, 1),
(1, 2, 1),
(2, 3, 2),
(2, 4, 1),
(3, 1, 1),
(3, 5, 1),
(4, 2, 1),
(4, 3, 2),
(5, 3, 2),
(5, 1, 1),
(6, 4, 2),
(7, 3, 2);
SELECT product_name, stock_quantity FROM products;
SELECT products.product_name, order_items.quantity
FROM order_items
JOIN products ON order_items.product_id = products.product_id
WHERE order_items.order_id = 1;
SELECT orders.order_id, products.product_name, order_items.quantity
FROM orders
JOIN order_items ON orders.order_id = order_items.order_id
JOIN products ON order_items.product_id = products.product_id
WHERE orders.customer_id = 1;
SELECT * FROM orders;
SELECT * FROM order_items;
-- Simulating order_id = 1
UPDATE products SET stock_quantity = stock_quantity - 1 WHERE product_id = 1;  -- Laptop
UPDATE products SET stock_quantity = stock_quantity - 1 WHERE product_id = 2;  -- Smartphone
SELECT * FROM products;
DELETE FROM order_items WHERE order_id = 1;
DELETE FROM orders WHERE order_id = 1;
SELECT * FROM order_items;
SELECT * FROM orders;