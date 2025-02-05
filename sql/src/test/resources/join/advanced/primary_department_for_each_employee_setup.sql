CREATE TABLE IF NOT EXISTS Employee
(
    employee_id   int,
    department_id int,
    primary_flag  varchar(1) CHECK (primary_flag IN ('Y', 'N'))
);
TRUNCATE TABLE Employee;
INSERT INTO Employee (employee_id, department_id, primary_flag)
VALUES ('1', '1', 'N'),
       ('2', '1', 'Y'),
       ('2', '2', 'N'),
       ('3', '3', 'N'),
       ('4', '2', 'N'),
       ('4', '3', 'Y'),
       ('4', '4', 'N');