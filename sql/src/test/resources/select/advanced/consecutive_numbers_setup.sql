CREATE TABLE IF NOT EXISTS Logs
(
    id  int,
    num int
);
TRUNCATE TABLE Logs;
INSERT INTO Logs (id, num)
VALUES ('1', '1'),
       ('2', '1'),
       ('3', '1'),
       ('4', '2'),
       ('5', '1'),
       ('6', '2'),
       ('7', '2');