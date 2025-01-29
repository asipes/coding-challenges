-- https://leetcode.com/problems/managers-with-at-least-5-direct-reports 570. Managers with at Least 5 Direct Reports

SELECT m.name
FROM employee m
         JOIN employee e ON m.id = e.managerId
GROUP BY m.name
HAVING COUNT(e.id) >= 5
