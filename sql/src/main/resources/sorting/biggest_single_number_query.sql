-- https://leetcode.com/problems/biggest-single-number 619. Biggest Single Number

SELECT MAX(num) AS num
FROM mynumbers
WHERE num IN (SELECT num
              FROM mynumbers
              GROUP BY num
              HAVING COUNT(*) = 1);