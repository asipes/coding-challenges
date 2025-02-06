-- https://leetcode.com/problems/investments-in-2016 585. Investments in 2016

WITH t15 AS
         (SELECT i.tiv_2015
          FROM insurance i
          GROUP BY i.tiv_2015
          HAVING COUNT(i.tiv_2015) > 1),
     adress AS
         (SELECT lat, lon
          FROM insurance
          GROUP BY lat, lon
          HAVING COUNT(*) = 1)
SELECT
    ROUND(SUM(i.tiv_2016)::NUMERIC, 2) AS tiv_2016
FROM
    insurance i
        JOIN t15 AS t ON i.tiv_2015 = t.tiv_2015
        JOIN adress AS a ON i.lat = a.lat AND i.lon = a.lon;








