-- https://leetcode.com/problems/find-customer-referee 584. Find Customer Referee

SELECT name
FROM customer
where referee_id != 2
   OR referee_id IS NULL;