-- https://leetcode.com/problems/movie-rating 1341. Movie Rating

WITH user_reviews AS (SELECT user_id, COUNT(*) AS count_review
                      FROM movierating
                      GROUP BY user_id),
     movie_ratings AS (SELECT movie_id, AVG(rating) AS avg_rating
                       FROM movierating
                       WHERE created_at BETWEEN '2020-02-01' AND '2020-02-29'
                       GROUP BY movie_id)
SELECT name AS results
FROM (SELECT u.name
      FROM users u
               JOIN user_reviews ur ON u.user_id = ur.user_id
      WHERE ur.count_review = (SELECT MAX(count_review) FROM user_reviews)
      ORDER BY u.name
      LIMIT 1) user_result
UNION ALL
SELECT title AS results
FROM (SELECT m.title
      FROM movies m
               JOIN movie_ratings mr ON m.movie_id = mr.movie_id
      WHERE mr.avg_rating = (SELECT MAX(avg_rating) FROM movie_ratings)
      ORDER BY m.title
      LIMIT 1) movie_result;



