-- https://leetcode.com/problems/average-selling-price 1251. Average Selling Price

SELECT p.product_id,
       ROUND(
               COALESCE(SUM(p.price * u.units) / SUM(u.units)::numeric, 0),
               2
       ) average_price
FROM prices p
         LEFT JOIN
     unitssold u
     ON
         p.product_id = u.product_id
             AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id;