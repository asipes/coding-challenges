CREATE TABLE IF NOT EXISTS Tweets(tweet_id int, content varchar(50));
TRUNCATE TABLE Tweets;
INSERT INTO Tweets (tweet_id, content)
VALUES ('1', 'Let us Code'),
       ('2', 'More than fifteen chars are here!');