-- https://leetcode.com/problems/the-number-of-employees-which-report-to-each-employee 1731. The Number of Employees Which Report to Each Employee

SELECT m.employee_id       AS employee_id,
       m.name              AS name,
       COUNT(e.reports_to) AS reports_count,
       ROUND(AVG(e.age))   AS average_age
FROM employees e
         JOIN
     employees m ON e.reports_to = m.employee_id
GROUP BY m.employee_id, m.name
ORDER BY m.employee_id;