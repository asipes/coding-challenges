CREATE TABLE IF NOT EXISTS Person
(
    Id    int,
    Email varchar(255)
);
TRUNCATE TABLE Person;
INSERT INTO Person (id, email)
VALUES ('1', 'john@example.com'),
       ('2', 'bob@example.com'),
       ('3', 'john@example.com');