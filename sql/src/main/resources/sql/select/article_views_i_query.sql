-- https://leetcode.com/problems/article-views-i 1148. Article Views I

SELECT DISTINCT author_id id
FROM views
WHERE author_id = viewer_id
ORDER BY id;