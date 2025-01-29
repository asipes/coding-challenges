-- https://leetcode.com/problems/queries-quality-and-percentage 1211. Queries Quality and Percentage

SELECT query_name,
       ROUND(SUM(rating / position::numeric) / COUNT(*), 2) quality,
       ROUND(COUNT(rating) FILTER(WHERE rating < 3) * 100.0 / COUNT(*), 2) poor_query_percentage
FROM queries
GROUP BY query_name;

-- SELECT query_name,
--        ROUND(SUM(rating / position::numeric) / COUNT(*), 2) quality,
--        ROUND(SUM(CASE WHEN rating < 3 THEN 1 ELSE 0 END) * 100.0 / COUNT(*), 2) poor_query_percentage
-- FROM queries
-- GROUP BY query_name;