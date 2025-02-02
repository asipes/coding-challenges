-- https://leetcode.com/problems/monthly-transactions-i 1193. Monthly Transactions I

/*
SELECT
    TO_CHAR(trans_date, 'YYYY-MM') AS month,
    country,
    COUNT(*) AS trans_count,
    SUM(CASE WHEN state = 'approved' THEN 1 ELSE 0 END) AS approved_count,
    SUM(amount) AS trans_total_amount,
    SUM(CASE WHEN state = 'approved' THEN amount ELSE 0 END) approved_total_amount
FROM
    transactions
GROUP BY
    month, country
ORDER BY
    month, country;
 */

SELECT TO_CHAR(trans_date, 'YYYY-MM')                 AS          month,
       country,
       COUNT(*)                                       AS          trans_count,
       COUNT(state) FILTER (WHERE state = 'approved') AS          approved_count,
       SUM(amount)                                    AS          trans_total_amount,
       COALESCE(SUM(amount) FILTER (WHERE state = 'approved'), 0) approved_total_amount
FROM transactions
GROUP BY month, country
ORDER BY month, country;
