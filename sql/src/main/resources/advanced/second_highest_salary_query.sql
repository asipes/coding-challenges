-- https://leetcode.com/problems/second-highest-salary 176. Second Highest Salary

SELECT (SELECT DISTINCT salary
        FROM employee
        ORDER BY salary DESC
        LIMIT 1 OFFSET 1) AS SecondHighestSalary;