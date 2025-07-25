# Write your MySQL query statement below
SELECT 
p.project_id,
ROUND(AVG(e.experience_years),2) as average_years
FROM 
Project p join Employee e
ON
 p.employee_id = e.employee_id
Group BY project_id;