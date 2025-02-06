-- https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends 602. Friend Requests II: Who Has the Most Friends

WITH t AS (SELECT requester_id        AS id,
                  COUNT(requester_id) AS friends
           FROM requestaccepted
           GROUP BY requester_id

           UNION ALL
           SELECT accepter_id        AS id,
                  COUNT(accepter_id) AS friends
           FROM requestaccepted
           GROUP BY accepter_id)
SELECT id,
       SUM(friends) AS num
FROM t
GROUP BY id
ORDER BY num DESC
LIMIT 1;





