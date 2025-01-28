-- https://leetcode.com/problems/invalid-tweets 1683. Invalid Tweets

SELECT tweet_id
FROM tweets
WHERE LENGTH(content) > 15;
