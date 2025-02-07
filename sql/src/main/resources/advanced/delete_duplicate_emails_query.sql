-- https://leetcode.com/problems/delete-duplicate-emails 196. Delete Duplicate Emails

DELETE
FROM person
WHERE id NOT IN (SELECT MIN(id)
                 FROM person
                 GROUP BY email)