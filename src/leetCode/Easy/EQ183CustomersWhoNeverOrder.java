package leetCode.Easy;

public class EQ183CustomersWhoNeverOrder {
}
/*
Table: Customers

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
+-------------+---------+
id is the primary key column for this table.
Each row of this table indicates the ID and name of a customer.


Table: Orders

+-------------+------+
| Column Name | Type |
+-------------+------+
| id          | int  |
| customerId  | int  |
+-------------+------+
id is the primary key column for this table.
customerId is a foreign key of the ID from the Customers table.
Each row of this table indicates the ID of an order and the ID of the customer who ordered it.


Write an SQL query to report all customers who never order anything.

Return the result table in any order.

The query result format is in the following example.



Example 1:

Input:
Customers table:
+----+-------+
| id | name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |
+----+-------+
Orders table:
+----+------------+
| id | customerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+
Output:
+-----------+
| Customers |
+-----------+
| Henry     |
| Max       |
+-----------+
 */

/*
My Answer:
# Write your MySQL query statement below
Select name As Customers
From Customers
Where id not IN(select customerId from Orders);
 */

/*
Official Solution
Approach: Using sub-query and NOT IN clause [Accepted]
Algorithm

If we have a list of customers who have ever ordered, it will be easy to know who never ordered.

We can use the following code to get such list.

select customerid from orders;
Then, we can use NOT IN to query the customers who are not in this list.

MySQL

select customers.name as 'Customers'
from customers
where customers.id not in
(
    select customerid from orders
);
 */

/*
Another Solution using Join


SELECT Customers.name AS Customers
FROM Customers
LEFT JOIN Orders
ON Customers.id = Orders.customerId
WHERE Orders.customerId is null;
 */