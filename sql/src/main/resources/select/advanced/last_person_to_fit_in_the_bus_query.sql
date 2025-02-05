-- https://leetcode.com/problems/last-person-to-fit-in-the-bus 1204. Last Person to Fit in the Bus

SELECT person_name
FROM (SELECT person_name,
             turn,
             SUM(weight) OVER (ORDER BY turn) AS running_weight
      FROM queue) t
WHERE running_weight <= 1000
ORDER BY turn DESC
LIMIT 1;