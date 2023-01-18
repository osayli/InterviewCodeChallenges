package leetCode.Easy;

public class EQ607SalesPerson {
}
/*
Table: SalesPerson

+-----------------+---------+
| Column Name     | Type    |
+-----------------+---------+
| sales_id        | int     |
| name            | varchar |
| salary          | int     |
| commission_rate | int     |
| hire_date       | date    |
+-----------------+---------+
sales_id is the primary key column for this table.
Each row of this table indicates the name and the ID of a salesperson alongside their salary, commission rate, and hire date.


Table: Company

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| com_id      | int     |
| name        | varchar |
| city        | varchar |
+-------------+---------+
com_id is the primary key column for this table.
Each row of this table indicates the name and the ID of a company and
the city in which the company is located.


Table: Orders

+-------------+------+
| Column Name | Type |
+-------------+------+
| order_id    | int  |
| order_date  | date |
| com_id      | int  |
| sales_id    | int  |
| amount      | int  |
+-------------+------+
order_id is the primary key column for this table.
com_id is a foreign key to com_id from the Company table.
sales_id is a foreign key to sales_id from the SalesPerson table.
Each row of this table contains information about one order.
This includes the ID of the company, the ID of the salesperson, the date of the order,
 and the amount paid.


Write an SQL query to report the names of all the salespersons who did not have any orders
 related to the company with the name "RED".

Return the result table in any order.

The query result format is in the following example.



Example 1:

Input:
SalesPerson table:
+----------+------+--------+-----------------+------------+
| sales_id | name | salary | commission_rate | hire_date  |
+----------+------+--------+-----------------+------------+
| 1        | John | 100000 | 6               | 4/1/2006   |
| 2        | Amy  | 12000  | 5               | 5/1/2010   |
| 3        | Mark | 65000  | 12              | 12/25/2008 |
| 4        | Pam  | 25000  | 25              | 1/1/2005   |
| 5        | Alex | 5000   | 10              | 2/3/2007   |
+----------+------+--------+-----------------+------------+
Company table:
+--------+--------+----------+
| com_id | name   | city     |
+--------+--------+----------+
| 1      | RED    | Boston   |
| 2      | ORANGE | New York |
| 3      | YELLOW | Boston   |
| 4      | GREEN  | Austin   |
+--------+--------+----------+
Orders table:
+----------+------------+--------+----------+--------+
| order_id | order_date | com_id | sales_id | amount |
+----------+------------+--------+----------+--------+
| 1        | 1/1/2014   | 3      | 4        | 10000  |
| 2        | 2/1/2014   | 4      | 5        | 5000   |
| 3        | 3/1/2014   | 1      | 1        | 50000  |
| 4        | 4/1/2014   | 1      | 4        | 25000  |
+----------+------------+--------+----------+--------+
Output:
+------+
| name |
+------+
| Amy  |
| Mark |
| Alex |
+------+
Explanation:
According to orders 3 and 4 in the Orders table, it is easy to tell that only salesperson John
 and Pam have sales to company RED, so we report all the other names in the table salesperson.
 */

/*
Solution:
select s.name from SalesPerson s
where sales_id not in(Select sales_id from Orders
where com_id=(select com_id from Company where name="RED"))
 */

/*
Sales Person
LeetCode

Solution
Approach: Using OUTER JOIN and NOT IN [Accepted]
Intuition

If we know all the persons who have sales in this company 'RED',
it will be fairly easy to know who do not have.

Algorithm

To start, we can query the information of sales in company 'RED' as a temporary table.
And then try to build a connection between this table and the salesperson table since
it has the name information.

SELECT
    *
FROM
    orders o
        LEFT JOIN
    company c ON o.com_id = c.com_id
WHERE
    c.name = 'RED'
;
Note: "LEFT OUTER JOIN" could be written as "LEFT JOIN".

| order_id | date     | com_id | sales_id | amount | com_id | name | city   |
|----------|----------|--------|----------|--------|--------|------|--------|
| 3        | 3/1/2014 | 1      | 1        | 50000  | 1      | RED  | Boston |
| 4        | 4/1/2014 | 1      | 4        | 25000  | 1      | RED  | Boston |
Obviously, the column sales_id exists in table salesperson so we may use it as a sub-query,
and then utilize the NOT IN to get the target data.

MySQL

SELECT
    s.name
FROM
    salesperson s
WHERE
    s.sales_id NOT IN (SELECT
            o.sales_id
        FROM
            orders o
                LEFT JOIN
            company c ON o.com_id = c.com_id
        WHERE
            c.name = 'RED')
;
 */

/*
Started with the nested query first

 select s.name
    from SalesPerson s
        left join Orders o on s.sales_id = o.sales_id
        left join Company c on o.com_id = c.com_id
    where c.name = 'Red'
This queried all salespersons who is associated with the company Red
Then, I added the NOT IN Where condition:

select s.name
from SalesPerson s
where s.name not in
    (select s.name
    from SalesPerson s
        left join Orders o on s.sales_id = o.sales_id
        left join Company c on o.com_id = c.com_id
    where c.name = 'Red')
 */

/*
Using JOIN

SELECT s.name FROM SalesPerson s
	WHERE s.sales_id NOT IN (
		SELECT o.sales_id FROM Orders o LEFT JOIN Company c
			ON c.com_id=o.com_id
		WHERE c.name="RED"
	);
Without using JOIN-

 SELECT name FROM SalesPerson
	 WHERE sales_id NOT IN(
		 SELECT sales_id FROM Orders WHERE com_id IN (
				 SELECT com_id FROM Company WHERE name="RED" )
	 );
 */