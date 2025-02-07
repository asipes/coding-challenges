-- https://leetcode.com/problems/patients-with-a-condition 1527. Patients With a Condition

SELECT *
FROM patients
WHERE EXISTS (SELECT 1
              FROM REGEXP_SPLIT_TO_TABLE(conditions, ' ') AS conditions
              WHERE conditions LIKE 'DIAB1%');