CREATE TABLE IF NOT EXISTS Employee
(
    id     int,
    salary int
);
TRUNCATE TABLE Employee;
INSERT INTO Employee (id, salary)
VALUES ('1', '100'),
       ('2', '200'),
       ('3', '300');