-- https://leetcode.com/problems/primary-department-for-each-employee 1789. Primary Department for Each Employee

SELECT employee_id   AS employee_id,
       department_id AS department_id
FROM employee
WHERE primary_flag = 'Y'

UNION ALL

SELECT employee_id   AS employee_id,
       department_id AS department_id
FROM employee
WHERE employee_id IN (SELECT employee_id AS employee_id
                      FROM employee
                      GROUP BY employee_id
                      HAVING COUNT(*) = 1);
