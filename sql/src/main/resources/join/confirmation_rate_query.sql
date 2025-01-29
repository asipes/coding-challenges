-- https://leetcode.com/problems/confirmation-rate 1934. Confirmation Rate

SELECT s.user_id,
       ROUND(
               COALESCE(SUM(CASE WHEN c.action = 'confirmed' THEN 1 ELSE 0 END) * 1.0 / NULLIF(COUNT(c.action), 0), 0),
               2
       ) AS confirmation_rate
FROM signups s
         LEFT JOIN
     confirmations c
     USING (user_id)
GROUP BY s.user_id;

-- SELECT s.user_id,
--        ROUND(AVG(COALESCE(c.action_type, 0)), 2) AS confirmation_rate
-- FROM signups s
--          LEFT JOIN
--      (SELECT user_id,
--              CASE WHEN action = 'confirmed' THEN 1 ELSE 0 END AS action_type
--       FROM confirmations) c
--      USING (user_id)
-- GROUP BY s.user_id;