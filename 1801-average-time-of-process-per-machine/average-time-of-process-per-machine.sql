# Write your MySQL query statement below
SELECT 
a1.machine_id , round(avg(a2.timestamp - a1.timestamp),3) as processing_time
from activity a1 join activity a2
on a1.machine_id = a2.machine_id AND a1.process_id = a2.process_id And a1.activity_type = 'start' AND a2.activity_type = 'end'
group by 1;