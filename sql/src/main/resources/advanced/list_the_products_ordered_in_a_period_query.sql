-- https://leetcode.com/problems/list-the-products-ordered-in-a-period 1327. List the Products Ordered in a Period

SELECT p.product_name,
       SUM(o.unit) AS unit
FROM products p
         JOIN orders o ON p.product_id = o.product_id
WHERE order_date BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY p.product_name
HAVING SUM(o.unit) > 99;