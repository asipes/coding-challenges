CREATE TABLE IF NOT EXISTS Users
(
    user_id int,
    name    varchar(40)
);
TRUNCATE TABLE Users;
INSERT INTO Users (user_id, name)
VALUES ('1', 'aLice'),
       ('2', 'bOB');