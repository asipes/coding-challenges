-- https://leetcode.com/problems/product-sales-analysis-i 1068. Product Sales Analysis I

SELECT p.product_name, s.year, s.price
FROM sales s
         JOIN product p ON s.product_id = p.product_id;
