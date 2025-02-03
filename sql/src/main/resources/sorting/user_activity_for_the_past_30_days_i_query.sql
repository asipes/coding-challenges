-- https://leetcode.com/problems/user-activity-for-the-past-30-days-i 1141. User Activity for the Past 30 Days I

SELECT activity_date AS day,
       COUNT(DISTINCT user_id) AS active_users
FROM activity
WHERE activity_date BETWEEN '2019-07-27'::DATE - INTERVAL '29 days' AND '2019-07-27'
GROUP BY activity_date;