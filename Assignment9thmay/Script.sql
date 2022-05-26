--<ScriptOptions statementTerminator=";"/>

CREATE TABLE loan_details (
	customer_number VARCHAR(6) NOT NULL,
	branch_id VARCHAR(6) NOT NULL,
	loan_amount INT,
	PRIMARY KEY (customer_number,branch_id)
);

CREATE TABLE customer_master (
	customer_number VARCHAR(6) NOT NULL,
	firstname VARCHAR(30),
	middlename VARCHAR(30),
	lastname VARCHAR(30),
	customer_city VARCHAR(15),
	customer_contact_no VARCHAR(10),
	occupation VARCHAR(20),
	customer_date_of_birth DATE,
	PRIMARY KEY (customer_number)
);

CREATE TABLE branch_master (
	branch_id VARCHAR(6) NOT NULL,
	branch_name VARCHAR(30),
	branch_city VARCHAR(30),
	PRIMARY KEY (branch_id)
);

CREATE TABLE transaction_details (
	transaction_number VARCHAR(6) NOT NULL,
	account_number VARCHAR(6),
	date_of_transaction DATE,
	medium_of_transaction VARCHAR(20),
	transaction_type VARCHAR(20),
	transaction_amount INT,
	PRIMARY KEY (transaction_number)
);

CREATE TABLE account_master (
	account_number VARCHAR(6) NOT NULL,
	customer_number VARCHAR(6),
	branch_id VARCHAR(6),
	opening_balance INT,
	account_opening_date DATE,
	account_type VARCHAR(10),
	account_status VARCHAR(10),
	PRIMARY KEY (account_number)
);

CREATE INDEX customer_number ON account_master (customer_number ASC);

CREATE INDEX account_number ON transaction_details (account_number ASC);

CREATE INDEX branch_id ON loan_details (branch_id ASC);

CREATE INDEX branch_id ON account_master (branch_id ASC);

