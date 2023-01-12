package leetCode.Easy;

public class EQ584FindCustomerReferee {
}
/*
Table: Customer

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
| referee_id  | int     |
+-------------+---------+
id is the primary key column for this table.
Each row of this table indicates the id of a customer, their name, and the id of the customer who referred them.


Write an SQL query to report the names of the customer that are not referred by the customer with id = 2.

Return the result table in any order.

The query result format is in the following example.



Example 1:

Input:
Customer table:
+----+------+------------+
| id | name | referee_id |
+----+------+------------+
| 1  | Will | null       |
| 2  | Jane | null       |
| 3  | Alex | 2          |
| 4  | Bill | null       |
| 5  | Zack | 1          |
| 6  | Mark | 2          |
+----+------+------------+
Output:
+------+
| name |
+------+
| Will |
| Jane |
| Bill |
| Zack |
+------+
 */

/*
My Answer:
Select name
From Customer
Where referee_id <>2 Or referee_id is null;
 */

/*
Official Solution
Approach: Using <>(!=) and IS NULL [Accepted]
Intuition

Some people come out the following solution by intuition.

SELECT name FROM customer WHERE referee_Id <> 2;
However, this query will only return one result:Zack although there are 4 customers not referred by Jane (including Jane herself). All the customers who were referred by nobody at all (NULL value in the referee_id column) don’t show up. But why?

Algorithm

MySQL uses three-valued logic -- TRUE, FALSE and UNKNOWN. Anything compared to NULL evaluates to the third value: UNKNOWN. That “anything” includes NULL itself! That’s why MySQL provides the IS NULL and IS NOT NULL operators to specifically check for NULL.

Thus, one more condition 'referee_id IS NULL' should be added to the WHERE clause as below.

MySQL

SELECT name FROM customer WHERE referee_id <> 2 OR referee_id IS NULL;
or

SELECT name FROM customer WHERE referee_id != 2 OR referee_id IS NULL;
Tips

The following solution is also wrong for the same reason as mentioned above. The key is to always use IS NULL or IS NOT NULL operators to specifically check for NULL value.

SELECT name FROM customer WHERE referee_id = NULL OR referee_id <> 2;
 */

/*
Another Solution

SELECT name
FROM Customer
WHERE COALESCE(referee_id,0) <> 2;

here COALESCE is used to replace NULL values with zero before checking whether it is equal to 2 or not.

 */