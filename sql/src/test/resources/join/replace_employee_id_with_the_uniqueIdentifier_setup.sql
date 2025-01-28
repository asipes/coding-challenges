CREATE TABLE IF NOT EXISTS Employees (id int, name varchar(20));
CREATE TABLE IF NOT EXISTS EmployeeUNI (id int, unique_id int);
TRUNCATE TABLE Employees;
INSERT INTO Employees (id, name)
VALUES ('1', 'Alice'),
       ('7', 'Bob'),
       ('11', 'Meir'),
       ('90', 'Winston'),
       ('3', 'Jonathan');
TRUNCATE TABLE EmployeeUNI;
INSERT INTO EmployeeUNI (id, unique_id)
VALUES ('3', '1'),
       ('11', '2'),
       ('90', '3');