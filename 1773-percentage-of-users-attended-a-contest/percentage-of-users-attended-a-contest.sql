SELECT
r.contest_id,round(count(distinct r.user_id)*100/(SELECT COUNT(*) FROM Users) ,2) as  percentage 
FROM Register r  GROUP BY r.contest_id 
ORDER BY  percentage desc , contest_id