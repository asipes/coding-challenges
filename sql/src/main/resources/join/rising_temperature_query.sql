-- https://leetcode.com/problems/rising-temperature 197. Rising Temperature

SELECT w1.id
FROM weather w1
         JOIN weather w2 ON w1.recorddate = w2.recorddate + INTERVAL '1 day'
WHERE w1.temperature > w2.temperature;