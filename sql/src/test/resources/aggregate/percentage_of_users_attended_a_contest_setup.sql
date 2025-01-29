CREATE TABLE IF NOT EXISTS Users
(
    user_id   int,
    user_name varchar(20)
);
CREATE TABLE IF NOT EXISTS Register
(
    contest_id int,
    user_id    int
);
TRUNCATE TABLE Users;
INSERT INTO Users (user_id, user_name)
VALUES ('6', 'Alice'),
       ('2', 'Bob'),
       ('7', 'Alex');
TRUNCATE TABLE Register;
INSERT INTO Register (contest_id, user_id)
VALUES ('215', '6'),
       ('209', '2'),
       ('208', '2'),
       ('210', '6'),
       ('208', '6'),
       ('209', '7'),
       ('209', '6'),
       ('215', '7'),
       ('208', '7'),
       ('210', '2'),
       ('207', '2'),
       ('210', '7');