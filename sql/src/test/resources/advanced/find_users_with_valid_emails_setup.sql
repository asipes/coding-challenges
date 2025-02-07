CREATE TABLE IF NOT EXISTS Users
(
    user_id int,
    name    varchar(30),
    mail    varchar(50)
);
TRUNCATE TABLE Users;
INSERT INTO Users (user_id, name, mail)
VALUES ('1', 'Winston', 'winston@leetcode.com'),
       ('2', 'Jonathan', 'jonathanisgreat'),
       ('3', 'Annabelle', 'bella-@leetcode.com'),
       ('4', 'Sally', 'sally.come@leetcode.com'),
       ('5', 'Marwan', 'quarz#2020@leetcode.com'),
       ('6', 'David', 'david69@gmail.com'),
       ('7', 'Shapiro', '.shapo@leetcode.com');