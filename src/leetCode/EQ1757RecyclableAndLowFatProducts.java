package leetCode;

public class EQ1757RecyclableAndLowFatProducts {
    /*
    +-------------+---------+
| Column Name | Type    |
+-------------+---------+
| product_id  | int     |
| low_fats    | enum    |
| recyclable  | enum    |
+-------------+---------+
product_id is the primary key for this table.
low_fats is an ENUM of type ('Y', 'N') where 'Y' means this product is low fat and 'N' means it is not.
recyclable is an ENUM of types ('Y', 'N') where 'Y' means this product is recyclable and 'N' means it is not.


Write an SQL query to find the ids of products that are both low fat and recyclable.

Return the result table in any order.

The query result format is in the following example.



Example 1:

Input:
Products table:
+-------------+----------+------------+
| product_id  | low_fats | recyclable |
+-------------+----------+------------+
| 0           | Y        | N          |
| 1           | Y        | Y          |
| 2           | N        | Y          |
| 3           | Y        | Y          |
| 4           | N        | N          |
+-------------+----------+------------+
Output:
+-------------+
| product_id  |
+-------------+
| 1           |
| 3           |
+-------------+
Explanation: Only products 1 and 3 are both low fat and recyclable.
     */

    /*
    MySolution

Select product_id
From Products
Where low_fats='Y' AND recyclable='Y'
     */



    /*
    This is a FaceBook Data Engineer interview question in 2019H2 - 2020H1.
    There are 4 SQL questions in 30 minute, this one is the first and easiest for warming up.
     But in the real interview, the description is harder than LC.
     First of all, they give you 4 tables, each table contains 7 - 9 columns.
     You need spend at least 5 ninutes to read the question and select top 10 rows to
      see what it is on each table.

The SQL question itself is simple but reading comprehension sometimes makes people nervous.

SELECT product_id FROM Products WHERE low_fats = 'Y' AND recyclable = 'Y' ORDER BY 1 ASC
The original question is :

Write a query to get the percentage of certain products

SELECT ROUND(AVG(CASE WHEN low_fats = 'Y' OR recyclable = 'Y' THEN 1 ELSE 0 END),2) AS PERCENTAGE
     */
}
