# Write your MySQL query statement below
select d.name Department, e.name Employee, e.salary Salary
from Employee e
JOIN Department d
ON e.departmentId=d.id and
(select count(distinct salary) from employee
where salary > e.salary and departmentId = e.departmentId
) <3
order by d.name, e.salary desc;