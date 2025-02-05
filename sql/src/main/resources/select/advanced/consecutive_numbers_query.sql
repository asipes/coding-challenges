-- https://leetcode.com/problems/consecutive-numbers 180. Consecutive Numbers

SELECT DISTINCT num AS ConsecutiveNums
FROM (SELECT num,
             LAG(num, 1) OVER (ORDER BY id) AS prev1,
             LAG(num, 2) OVER (ORDER BY id) AS prev2
      FROM logs) AS three
WHERE three.num = three.prev1
  AND three.num = three.prev2;