-- https://leetcode.com/problems/product-sales-analysis-iii 1070. Product Sales Analysis III

WITH first_year as (SELECT *, RANK() OVER (PARTITION BY product_id ORDER BY year) AS rang
                    FROM sales)
SELECT product_id, year AS first_year, quantity, price
FROM first_year
where rang = 1;