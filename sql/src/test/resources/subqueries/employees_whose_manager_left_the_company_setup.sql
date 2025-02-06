CREATE TABLE IF NOT EXISTS Employees
(
    employee_id int,
    name        varchar(20),
    manager_id  int,
    salary      int
);
TRUNCATE TABLE Employees;
INSERT INTO Employees (employee_id, name, manager_id, salary)
VALUES ('3', 'Mila', '9', '60301'),
       ('12', 'Antonella', NULL, '31000'),
       ('13', 'Emery', NULL, '67084'),
       ('1', 'Kalel', '11', '21241'),
       ('9', 'Mikaela', NULL, '50937'),
       ('11', 'Joziah', '6', '28485');