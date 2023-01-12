package leetCode.Easy;

public class EQ595BigCountries {
}
/*
Table: World

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| name        | varchar |
| continent   | varchar |
| area        | int     |
| population  | int     |
| gdp         | int     |
+-------------+---------+
name is the primary key column for this table.
Each row of this table gives information about the name of a country, the continent to which it belongs, its area, the population, and its GDP value.


A country is big if:

it has an area of at least three million (i.e., 3000000 km2), or
it has a population of at least twenty-five million (i.e., 25000000).
Write an SQL query to report the name, population, and area of the big countries.

Return the result table in any order.

The query result format is in the following example.



Example 1:

Input:
World table:
+-------------+-----------+---------+------------+--------------+
| name        | continent | area    | population | gdp          |
+-------------+-----------+---------+------------+--------------+
| Afghanistan | Asia      | 652230  | 25500100   | 20343000000  |
| Albania     | Europe    | 28748   | 2831741    | 12960000000  |
| Algeria     | Africa    | 2381741 | 37100000   | 188681000000 |
| Andorra     | Europe    | 468     | 78115      | 3712000000   |
| Angola      | Africa    | 1246700 | 20609294   | 100990000000 |
+-------------+-----------+---------+------------+--------------+
Output:
+-------------+------------+---------+
| name        | population | area    |
+-------------+------------+---------+
| Afghanistan | 25500100   | 652230  |
| Algeria     | 37100000   | 2381741 |
+-------------+------------+---------+
 */

/*
My answer

Select name, population, area
from World
Where area>=3000000 Or population>=25000000;
 */


/*
Official Solution
Approach I: Using WHERE clause and OR [Accepted]
Intuition

Use WHERE clause in SQL to filter these records and get the target countries.

Algorithm

According to the definition, a big country meets at least one of the following two conditions:

It has an area of bigger than 3 million square km.
It has a population of more than 25 million.
So for the first condition, we can use the following code to get the big countries of this type.

SELECT name, population, area FROM world WHERE area >= 3000000
In addition, we can use below code to get big countries of more than 25 million people.

SELECT name, population, area FROM world WHERE population >= 25000000
As most people may already come into mind, we can use OR to combine these two solutions for the two sub-problems together.

MySQL

SELECT
    name, population, area
FROM
    world
WHERE
    area >= 3000000 OR population >= 25000000
;
Approach II: Using WHERE clause and UNION [Accepted]
Algorithm

The idea of this approach is the same as the first one. However, we use UNION instead of OR.

MySQL

SELECT
    name, population, area
FROM
    world
WHERE
    area >= 3000000

UNION

SELECT
    name, population, area
FROM
    world
WHERE
    population >= 25000000
;
Note: This solution runs a little bit faster than the first one. However, they do not have big difference.
 */