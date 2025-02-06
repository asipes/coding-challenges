-- https://leetcode.com/problems/employees-whose-manager-left-the-company 1978. Employees Whose Manager Left the Company

SELECT employee_id
FROM employees
WHERE employees.manager_id NOT IN (SELECT employee_id
                                   FROM employees
                                   WHERE employee_id IS NOT NULL)
  AND salary < 30000
ORDER BY employee_id;