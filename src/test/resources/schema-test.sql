drop database if exists just_dab_db_test;

create database if not exists just_dab_db_test;

use just_dab_db_test;

create table if not exists client {

    advisor_id int,
     FOREIGN KEY (advisor_id) REFERENCES employee(ID)
    id int PRIMARY KEY AUTO_INCREMENT,
    email varchar(25) NOT NULL,
    firstName varchar(25) NOT NULL,
    lastName varchar(25) NOT NULL,
    password varchar(25) NOT NULL,


}


