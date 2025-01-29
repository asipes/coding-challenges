-- https://leetcode.com/problems/not-boring-movies 620. Not Boring Movies

SELECT id,
       movie,
       description,
       rating
FROM cinema
WHERE id % 2 <> 0
  AND description <> 'boring'
ORDER BY rating DESC;