-- https://leetcode.com/problems/average-time-of-process-per-machine 1661. Average Time of Process per Machine

SELECT a1.machine_id, ROUND(CAST(AVG(a2.timestamp - a1.timestamp) AS numeric), 3) processing_time
FROM activity a1
         JOIN activity a2 ON a1.machine_id = a2.machine_id
    AND a1.process_id = a2.process_id
    AND a1.activity_type = 'start'
    AND a2.activity_type = 'end'
GROUP BY a1.machine_id;
