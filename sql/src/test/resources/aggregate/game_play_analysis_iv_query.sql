-- https://leetcode.com/problems/game-play-analysis-iv 550. Game Play Analysis IV

WITH rank_activity AS (SELECT player_id,
                              event_date,
                              RANK() OVER (PARTITION BY player_id ORDER BY event_date) AS        order_day,
                              LEAD(event_date) OVER (PARTITION BY player_id ORDER BY event_date) next_day
                       FROM activity)
SELECT ROUND(COUNT(player_id) FILTER ( WHERE order_day = 1 AND next_day = event_date + INTERVAL '1' DAY ) /
             COUNT(DISTINCT player_id)::numeric, 2) AS fraction
FROM rank_activity;