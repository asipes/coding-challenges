CREATE TABLE IF NOT EXISTS Followers
(
    user_id     int,
    follower_id int
);
TRUNCATE TABLE Followers;
INSERT INTO Followers (user_id, follower_id)
VALUES ('0', '1'),
       ('1', '0'),
       ('2', '0'),
       ('2', '1');