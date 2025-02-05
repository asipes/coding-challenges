CREATE TABLE IF NOT EXISTS Employees
(
    employee_id int,
    name        varchar(20),
    reports_to  int,
    age         int
);
TRUNCATE TABLE Employees;
INSERT INTO Employees (employee_id, name, reports_to, age)
VALUES ('9', 'Hercy', NULL, '43'),
       ('6', 'Alice', '9', '41'),
       ('4', 'Bob', '9', '36'),
       ('2', 'Winston', NULL, '37');