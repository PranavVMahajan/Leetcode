# Write your MySQL query statement below
SELECT 
r.contest_id ,  ROUND((COUNT(DISTINCT r.user_id) / (SELECT COUNT(DISTINCT user_id) FROM Users)) * 100, 2) as percentage
FROM Register r join Users u on r.user_id = u.user_id
group by contest_id
order by percentage desc, contest_id
