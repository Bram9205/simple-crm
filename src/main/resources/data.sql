DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
  customer_id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

INSERT INTO customer (name) VALUES
  ('Google'),
  ('Facebook'),
  ('Microsoft');