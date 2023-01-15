package leetCode.Easy;

public class EQ1667FixNamesInATable {
}
/*
Table: Users

+----------------+---------+
| Column Name    | Type    |
+----------------+---------+
| user_id        | int     |
| name           | varchar |
+----------------+---------+
user_id is the primary key for this table.
This table contains the ID and the name of the user. The name consists of only lowercase and uppercase characters.


Write an SQL query to fix the names so that only the first character is uppercase and the rest are lowercase.

Return the result table ordered by user_id.

The query result format is in the following example.



Example 1:

Input:
Users table:
+---------+-------+
| user_id | name  |
+---------+-------+
| 1       | aLice |
| 2       | bOB   |
+---------+-------+
Output:
+---------+-------+
| user_id | name  |
+---------+-------+
| 1       | Alice |
| 2       | Bob   |
+---------+-------+
 */
/*
Solution:
select user_id,
 concat(UPPER(substring(name,1,1)),LOWER(substring(name,2))) as name
 from Users
 ORDER BY user_id;
 */

/*
Explanation and solution
In SQL, we can accomplish this task by using a combination of string functions. In this case, we are going to use CONCAT, UPPER, LOWER and SUBSTR functions.

The CONCAT function is used to join two or more strings together. In our case, we want to join the uppercase first letter of the name with the rest of the name in lowercase.

The UPPER function is used to convert a string to uppercase. We use this function to convert the first letter of the name to uppercase.

The LOWER function is used to convert a string to lowercase. We use this function to convert the rest of the name to lowercase.

The SUBSTR function is used to extract a substring from a given string. We use this function to extract the first letter of the name, and the rest of the name from the original name.

Putting it all together, the query would look like this:

SELECT user_id, CONCAT(UPPER(SUBSTR(name, 1, 1)), LOWER(SUBSTR(name, 2))) as name
FROM Users
ORDER BY user_id;
Code
# Write your MySQL query statement below

SELECT user_id,
CONCAT(UPPER(SUBSTR(name,1,1)),LOWER(SUBSTR(name,2))) as name
FROM Users
ORDER BY user_id;
 */

/*
Other Solution
SELECT user_id, CONCAT(UPPER(LEFT(name, 1)), LOWER(RIGHT(name, LENGTH(name)-1))) AS name
FROM Users
ORDER BY user_id ASC;
 */