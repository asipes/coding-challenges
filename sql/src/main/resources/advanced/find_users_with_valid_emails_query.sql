-- https://leetcode.com/problems/find-users-with-valid-e-mails 1517. Find Users With Valid E-Mails

SELECT user_id, name, mail
FROM users
WHERE mail ~ '^[a-zA-Z][a-zA-Z0-9._-]*@leetcode\.com$';

