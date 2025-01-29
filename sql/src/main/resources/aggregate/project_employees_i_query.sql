-- https://leetcode.com/problems/project-employees-i 1075. Project Employees I

SELECT p.project_id, ROUND(AVG(e.experience_years), 2) average_years
FROM project p
         JOIN Employee e USING (employee_id)
GROUP BY p.project_id;

-- SELECT p.project_id, ROUND(SUM(e.experience_years) / COUNT(e.employee_id)::numeric, 2) average_years
-- FROM project p
--          JOIN Employee e USING (employee_id)
-- GROUP BY p.project_id;