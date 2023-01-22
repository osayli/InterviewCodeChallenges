package leetCode.Easy;

public class EQ1965EmployeesWithMissingInformation {
}
/*
Table: Employees

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| employee_id | int     |
| name        | varchar |
+-------------+---------+
employee_id is the primary key for this table.
Each row of this table indicates the name of the employee whose ID is employee_id.


Table: Salaries

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| employee_id | int     |
| salary      | int     |
+-------------+---------+
employee_id is the primary key for this table.
Each row of this table indicates the salary of the employee whose ID is employee_id.


Write an SQL query to report the IDs of all the employees with missing information. The information of an employee is missing if:

The employee's name is missing, or
The employee's salary is missing.
Return the result table ordered by employee_id in ascending order.

The query result format is in the following example.



Example 1:

Input:
Employees table:
+-------------+----------+
| employee_id | name     |
+-------------+----------+
| 2           | Crew     |
| 4           | Haven    |
| 5           | Kristian |
+-------------+----------+
Salaries table:
+-------------+--------+
| employee_id | salary |
+-------------+--------+
| 5           | 76071  |
| 1           | 22517  |
| 4           | 63539  |
+-------------+--------+
Output:
+-------------+
| employee_id |
+-------------+
| 1           |
| 2           |
+-------------+
Explanation:
Employees 1, 2, 4, and 5 are working at this company.
The name of employee 1 is missing.
The salary of employee 2 is missing.
 */

/*
Solution:
select employee_id
from Employees
where employee_id not in(
    select employee_id
    from Salaries)
union
select employee_id
from Salaries
where employee_id not in(
    select employee_id
    from Employees)
   ORDER BY employee_id
 */

/*
select e.employee_id from employees e  left join salaries s on e.employee_id=s.employee_id where s.salary is null
union
select s.employee_id from salaries s  left join employees e on e.employee_id=s.employee_id where e.name is null
order by employee_id;
 */




/*
#FASTEST : Using Group BY
SELECT T.employee_id FROM
(
SELECT * FROM Employees
UNION ALL
SELECT * FROM Salaries
) T
GROUP BY T.employee_id
HAVING COUNT(T.employee_id) = 1
ORDER BY T.employee_id ASC;

#Using UNION and WHERE NOT IN
SELECT employee_id FROM Salaries WHERE employee_id NOT IN (SELECT employee_id FROM Employees WHERE name IS NOT NULL)
UNION
SELECT employee_id FROM Employees WHERE employee_id NOT IN (SELECT employee_id FROM Salaries WHERE salary IS NOT NULL)
ORDER BY employee_id ASC;

#Using JOIN
SELECT JOINEDTABLE.employee_id
FROM
(
SELECT *
FROM Employees
LEFT JOIN Salaries
USING(employee_id)
UNION
SELECT *
FROM Salaries
LEFT JOIN Employees
USING(employee_id)
)
AS JOINEDTABLE
WHERE JOINEDTABLE.salary IS NULL OR JOINEDTABLE.name IS NULL
ORDER BY JOINEDTABLE.employee_id ASC;
 */