-- https://leetcode.com/problems/restaurant-growth 1321. Restaurant Growth

SELECT weak.visited_on,
       SUM(c.amount)                 AS amount,
       ROUND(SUM(c.amount) / 7.0, 2) AS average_amount
FROM (SELECT DISTINCT visited_on
      FROM customer
      ORDER BY visited_on
      OFFSET 6) weak
         JOIN customer c
              ON c.visited_on BETWEEN weak.visited_on - 6 AND weak.visited_on
GROUP BY weak.visited_on;