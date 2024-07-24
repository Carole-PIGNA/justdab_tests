DROP database just_dab_db_test;
CREATE database if NOT EXISTS just_dab_db_test;

CREATE TABLE IF NOT EXISTS employee (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS client (
    id INT PRIMARY KEY AUTO_INCREMENT,
    advisor_id INT,
    email VARCHAR(25) NOT NULL,
    firstName VARCHAR(25) NOT NULL,
    lastName VARCHAR(25) NOT NULL,
    password VARCHAR(25) NOT NULL,
    FOREIGN KEY (advisor_id) REFERENCES employee(ID)
);

CREATE TABLE IF NOT EXISTS account (
    id INT PRIMARY KEY AUTO_INCREMENT,
    balance DOUBLE,
    client_id INT,
    FOREIGN KEY (client_id) REFERENCES client(ID)
);


