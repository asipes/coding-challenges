-- https://leetcode.com/problems/count-salary-categories 1907. Count Salary Categories


SELECT 'Low Salary' AS category,
       COUNT(*) FILTER (WHERE income < 20000) AS accounts_count
FROM accounts
UNION
SELECT 'Average Salary',
       COUNT(*) FILTER (WHERE income BETWEEN 20000 AND 50000)
FROM accounts
UNION
SELECT 'High Salary',
       COUNT(*) FILTER (WHERE income > 50000)
FROM accounts;




