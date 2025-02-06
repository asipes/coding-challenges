-- https://leetcode.com/problems/exchange-seats 626. Exchange Seats

SELECT CASE
           WHEN id % 2 = 1 AND LEAD(id) OVER (ORDER BY id) IS NOT NULL THEN id + 1
           WHEN id % 2 = 0 THEN id - 1
           ELSE id
           END AS id,
       student
FROM seat
ORDER BY id;