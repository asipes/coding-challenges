-- https://leetcode.com/problems/number-of-unique-subjects-taught-by-each-teacher 2356. Number of Unique Subjects Taught by Each Teacher

SELECT teacher_id AS teacher_id, COUNT(DISTINCT subject_id) AS cnt
FROM teacher
GROUP BY teacher_id;