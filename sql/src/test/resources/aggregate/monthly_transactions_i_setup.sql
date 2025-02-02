CREATE TABLE IF NOT EXISTS Transactions
(
    id         int,
    country    varchar(4),
    state      varchar(10) CHECK (state IN ('approved', 'declined')),
    amount     int,
    trans_date date
);
TRUNCATE TABLE Transactions;
INSERT INTO Transactions (id, country, state, amount, trans_date)
VALUES ('121', 'US', 'approved', '1000', '2018-12-18'),
       ('122', 'US', 'declined', '2000', '2018-12-19'),
       ('123', 'US', 'approved', '2000', '2019-01-01'),
       ('124', 'DE', 'approved', '2000', '2019-01-07');