--https://leetcode.com/problems/big-countries 595. Big Countries

SELECT name, population, area
FROM world
where population >= 25 * 1e6
   OR area >= 3 * 1e6