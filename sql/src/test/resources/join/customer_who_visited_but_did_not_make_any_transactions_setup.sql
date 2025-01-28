CREATE TABLE IF NOT EXISTS Visits(visit_id int, customer_id int);
CREATE TABLE IF NOT EXISTS Transactions(transaction_id int, visit_id int, amount int);
TRUNCATE TABLE Visits;
INSERT INTO Visits (visit_id, customer_id)
VALUES ('1', '23'),
       ('2', '9'),
       ('4', '30'),
       ('5', '54'),
       ('6', '96'),
       ('7', '54'),
       ('8', '54');
TRUNCATE TABLE Transactions;
INSERT INTO Transactions (transaction_id, visit_id, amount)
VALUES ('2', '5', '310'),
       ('3', '5', '300'),
       ('9', '5', '200'),
       ('12', '1', '910'),
       ('13', '2', '970');