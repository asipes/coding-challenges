-- https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier 1378. Replace Employee ID With The Unique Identifier

SELECT eu.unique_id, e.name
FROM employees e
         LEFT JOIN employeeuni eu ON e.id = eu.id;