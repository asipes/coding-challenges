-- https://leetcode.com/problems/immediate-food-delivery-ii 1174. Immediate Food Delivery II

SELECT ROUND(
               AVG(CASE WHEN customer_pref_delivery_date = order_date THEN 1 ELSE 0 END) * 100.0, 2
       ) AS immediate_percentage
FROM (SELECT MIN(order_date) AS order_date, MIN(customer_pref_delivery_date) AS customer_pref_delivery_date
      FROM delivery
      GROUP BY customer_id) AS first_orders;