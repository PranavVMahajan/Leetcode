-- # Write your MySQL query statement below
-- SELECT 
-- W1.id 
-- FROM Weather as W1, Weather as W2
-- WHERE dateDiff(W1.recordDate, W2.recordDate) = 1 and W1.temperature > W2.temperature;

SELECT w1.id
FROM Weather w1
JOIN Weather w2
  ON DATEDIFF(w1.recordDate, w2.recordDate) = 1
WHERE w1.temperature > w2.temperature;
