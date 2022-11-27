CREATE DATABASE app;

\c app;

DROP DATABASE app;

CREATE TABLE IF NOT EXISTS 	products(
	id SERIAL,
	cod VARCHAR(6) NOT NULL,
	name VARCHAR(50) NOT NULL,
	validade VARCHAR(15) NOT NULL,
	price REAL NOT NULL
);

DROP TABLE products;

SELECT * FROM products;

DELETE FROM products; /*utilize com where*/



