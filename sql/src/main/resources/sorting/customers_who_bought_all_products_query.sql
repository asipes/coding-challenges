-- https://leetcode.com/problems/customers-who-bought-all-products 1045. Customers Who Bought All Products

WITH product_count AS (SELECT COUNT(*) AS total_products
                       FROM product)
SELECT c.customer_id
FROM customer c
         CROSS JOIN product_count pc
GROUP BY c.customer_id, pc.total_products
HAVING COUNT(DISTINCT c.product_key) = pc.total_products;
