-- https://leetcode.com/problems/product-price-at-a-given-date 1164. Product Price at a Given Date

SELECT p.product_id,
       COALESCE(
               (SELECT new_price
                FROM products
                WHERE product_id = p.product_id
                  AND change_date <= '2019-08-16'
                ORDER BY change_date DESC
                LIMIT 1),
               10
       ) AS price
FROM (SELECT DISTINCT product_id FROM products) p;