-- https://leetcode.com/problems/investments-in-2016 585. Investments in 2016

SELECT d.name   AS Department,
       e.name   AS Employee,
       e.salary AS Salary
FROM employee e
         JOIN department d ON e.departmentid = d.id
WHERE e.salary IN (SELECT DISTINCT salary
                   FROM employee
                   WHERE departmentid = e.departmentid
                   ORDER BY salary DESC
                   LIMIT 3);