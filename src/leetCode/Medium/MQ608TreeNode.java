package leetCode.Medium;

public class MQ608TreeNode {
}
/*
608. Tree Node

Table: Tree

+-------------+------+
| Column Name | Type |
+-------------+------+
| id          | int  |
| p_id        | int  |
+-------------+------+
id is the primary key column for this table.
Each row of this table contains information about the id of a node and
 the id of its parent node in a tree.
The given structure is always a valid tree.


Each node in the tree can be one of three types:

"Leaf": if the node is a leaf node.
"Root": if the node is the root of the tree.
"Inner": If the node is neither a leaf node nor a root node.
Write an SQL query to report the type of each node in the tree.

Return the result table in any order.

The query result format is in the following example.



Example 1:


Input:
Tree table:
+----+------+
| id | p_id |
+----+------+
| 1  | null |
| 2  | 1    |
| 3  | 1    |
| 4  | 2    |
| 5  | 2    |
+----+------+
Output:
+----+-------+
| id | type  |
+----+-------+
| 1  | Root  |
| 2  | Inner |
| 3  | Leaf  |
| 4  | Leaf  |
| 5  | Leaf  |
+----+-------+
Explanation:
Node 1 is the root node because its parent node is null and it has child nodes 2 and 3.
Node 2 is an inner node because it has parent node 1 and child node 4 and 5.
Nodes 3, 4, and 5 are leaf nodes because they have parent nodes and they do not have child nodes.
 */



/*
Solution:

select id,'Root' as type from tree t where p_id is null
union
select id,'Inner' as type from tree t where exists(select 1 from tree where p_id = t.id ) and p_id is not null
union
select id,'Leaf' as type from tree t where not exists(select 1 from tree where p_id = t.id )and p_id is not null
 */



/*

Tree Node
LeetCode

Solution
Approach I: Using UNION [Accepted]
Intuition

We can print the node type by judging every record by its definition in this table.

Root: it does not have a parent node at all
Inner: it is the parent node of some nodes, and it has a not NULL parent itself.
Leaf: rest of the cases other than above two
Algorithm

By transiting the node type definition, we can have the following code.

For the root node, it does not have a parent.

SELECT
    id, 'Root' AS Type
FROM
    tree
WHERE
    p_id IS NULL
For the leaf nodes, they do not have any children, and it has a parent.

SELECT
    id, 'Leaf' AS Type
FROM
    tree
WHERE
    id NOT IN (SELECT DISTINCT
            p_id
        FROM
            tree
        WHERE
            p_id IS NOT NULL)
        AND p_id IS NOT NULL
For the inner nodes, they have some children and a parent.

SELECT
    id, 'Inner' AS Type
FROM
    tree
WHERE
    id IN (SELECT DISTINCT
            p_id
        FROM
            tree
        WHERE
            p_id IS NOT NULL)
        AND p_id IS NOT NULL
So, one solution to the problem is to combine these cases together using UNION.

MySQL

SELECT
    id, 'Root' AS Type
FROM
    tree
WHERE
    p_id IS NULL

UNION

SELECT
    id, 'Leaf' AS Type
FROM
    tree
WHERE
    id NOT IN (SELECT DISTINCT
            p_id
        FROM
            tree
        WHERE
            p_id IS NOT NULL)
        AND p_id IS NOT NULL

UNION

SELECT
    id, 'Inner' AS Type
FROM
    tree
WHERE
    id IN (SELECT DISTINCT
            p_id
        FROM
            tree
        WHERE
            p_id IS NOT NULL)
        AND p_id IS NOT NULL
ORDER BY id;
Approach II: Using flow control statement CASE [Accepted]
Algorithm

The idea is similar with the above solution but the code is simpler by utilizing
the flow control statements, which is effective to output differently based on different
 input values. In this case, we can use CASE statement.

MySQL

SELECT
    id AS `Id`,
    CASE
        WHEN tree.id = (SELECT atree.id FROM tree atree WHERE atree.p_id IS NULL)
          THEN 'Root'
        WHEN tree.id IN (SELECT atree.p_id FROM tree atree)
          THEN 'Inner'
        ELSE 'Leaf'
    END AS Type
FROM
    tree
ORDER BY `Id`
;
MySQL provides different flow control statements besides CASE. You can try to rewrite
the solution above using IF flow control statement.

Approach III: Using IF function [Accepted]
Algorithm

Also, we can use a single IF function instead of the complex flow control statements.

MySQL

SELECT
    atree.id,
    IF(ISNULL(atree.p_id),
        'Root',
        IF(atree.id IN (SELECT p_id FROM tree), 'Inner','Leaf')) Type
FROM
    tree atree
ORDER BY atree.id
 */

/*
select a.id,(
    case
    when a.p_id is null
    then 'Root'
    when exists(select  * from Tree t where t.p_id=a.id)
    then 'Inner'
    else 'Leaf' end
    ) AS type
from Tree a;
 */

