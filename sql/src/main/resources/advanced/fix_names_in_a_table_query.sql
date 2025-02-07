-- https://leetcode.com/problems/fix-names-in-a-table 1667. Fix Names in a Table

SELECT user_id,
       INITCAP(SPLIT_PART(name, ' ', 1)) ||
       CASE
           WHEN POSITION(' ' IN name) = 0 THEN ''
           ELSE ' ' || LOWER(SUBSTRING(name FROM POSITION(' ' IN name) + 1))
           END AS name
FROM users
ORDER BY user_id;