USE just_dab_db_test;

INSERT INTO employee (email, first_name, last_name, password)
VALUES ('exemple@exemple.com', 'John', 'Doe', 'password');

INSERT INTO client (advisor_id, email, firstName, lastName, password)
VALUES (1, 'client@example.com', 'FirstName', 'LastName', 'password');

INSERT INTO account (balance)
VALUES (120.0);
