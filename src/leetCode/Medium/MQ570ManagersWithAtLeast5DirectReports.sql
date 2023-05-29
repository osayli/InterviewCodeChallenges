--Table: Employee
--
--+-------------+---------+
--| Column Name | Type    |
--+-------------+---------+
--| id          | int     |
--| name        | varchar |
--| department  | varchar |
--| managerId   | int     |
--+-------------+---------+
--id is the primary key column for this table.
--Each row of this table indicates the name of an employee, their department, and the id of their manager.
--If managerId is null, then the employee does not have a manager.
--No employee will be the manager of themself.
--
--
--Write an SQL query to report the managers with at least five direct reports.
--
--Return the result table in any order.
--
--The query result format is in the following example.
--
--
--
--Example 1:
--
--Input:
--Employee table:
--+-----+-------+------------+-----------+
--| id  | name  | department | managerId |
--+-----+-------+------------+-----------+
--| 101 | John  | A          | None      |
--| 102 | Dan   | A          | 101       |
--| 103 | James | A          | 101       |
--| 104 | Amy   | A          | 101       |
--| 105 | Anne  | A          | 101       |
--| 106 | Ron   | B          | 101       |
--+-----+-------+------------+-----------+
--Output:
--+------+
--| name |
--+------+
--| John |
--+------+

-- Solution 1

 SELECT name
 FROM Employee as t1
 INNER JOIN (
  select managerId
  from Employee
  group by ManagerId
 having count(ManagerId)>=5) as t2
 on t1.Id=t2.ManagerId;

-- Solution 2
SELECT DISTINCT e1.name
FROM Employee AS e1
LEFT JOIN Employee AS e2
ON e1.id = e2.managerId
GROUP BY e1.id
 HAVING COUNT(*) >= 5;