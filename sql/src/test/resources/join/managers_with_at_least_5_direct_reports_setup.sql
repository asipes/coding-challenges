CREATE TABLE IF NOT EXISTS Employee (id int, name varchar(255), department varchar(255), managerId int);
TRUNCATE TABLE Employee;
INSERT INTO Employee (id, name, department, managerId)
VALUES ('101', 'John', 'A', NULL),
       ('102', 'Dan', 'A', '101'),
       ('103', 'James', 'A', '101'),
       ('104', 'Amy', 'A', '101'),
       ('105', 'Anne', 'A', '101'),
       ('106', 'Ron', 'B', '101');