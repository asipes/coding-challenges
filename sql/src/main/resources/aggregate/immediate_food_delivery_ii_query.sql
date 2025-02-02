-- https://leetcode.com/problems/immediate-food-delivery-ii 1174. Immediate Food Delivery II

SELECT ROUND(
                       COUNT(*) FILTER (WHERE order_date = customer_pref_delivery_date AND rank = 1) * 100.0 /
                       COUNT(*) FILTER (WHERE rank = 1), 2) AS immediate_percentage
FROM (SELECT *,
             RANK() OVER (PARTITION BY customer_id ORDER BY order_date) AS rank
      FROM delivery) AS first_orders

/*
 SELECT ROUND(COUNT(*) FILTER (WHERE order_date = customer_pref_delivery_date) * 100.0 / COUNT(*), 2)::numeric(10,2) AS immediate_percentage
FROM (SELECT DISTINCT ON (order_date) order_date,
                                      customer_pref_delivery_date
      FROM delivery
      GROUP BY order_date, customer_pref_delivery_date) AS first_orders;
 */
