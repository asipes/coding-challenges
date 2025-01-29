CREATE TABLE IF NOT EXISTS Project (project_id int, employee_id int);
CREATE TABLE IF NOT EXISTS Employee (employee_id int, name varchar(10), experience_years int);
TRUNCATE TABLE Project;
INSERT INTO Project (project_id, employee_id)
VALUES ('1', '1'),
       ('1', '2'),
       ('1', '3'),
       ('2', '1'),
       ('2', '4');
TRUNCATE TABLE Employee;
INSERT INTO Employee (employee_id, name, experience_years)
VALUES ('1', 'Khaled', '3'),
       ('2', 'Ali', '2'),
       ('3', 'John', '1'),
       ('4', 'Doe', '2');