-- https://leetcode.com/problems/group-sold-products-by-the-date 1484. Group Sold Products By The Date

SELECT sell_date,
       COUNT(DISTINCT product)                      AS num_sold,
       STRING_AGG(DISTINCT product, ',') AS products
FROM activities
GROUP BY sell_date
ORDER BY sell_date;