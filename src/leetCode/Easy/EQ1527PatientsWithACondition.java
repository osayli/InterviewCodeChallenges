package leetCode.Easy;

public class EQ1527PatientsWithACondition {
}
/*
Table: Patients

+--------------+---------+
| Column Name  | Type    |
+--------------+---------+
| patient_id   | int     |
| patient_name | varchar |
| conditions   | varchar |
+--------------+---------+
patient_id is the primary key for this table.
'conditions' contains 0 or more code separated by spaces.
This table contains information of the patients in the hospital.


Write an SQL query to report the patient_id, patient_name and conditions of the patients who have Type I Diabetes. Type I Diabetes always starts with DIAB1 prefix.

Return the result table in any order.

The query result format is in the following example.



Example 1:

Input:
Patients table:
+------------+--------------+--------------+
| patient_id | patient_name | conditions   |
+------------+--------------+--------------+
| 1          | Daniel       | YFEV COUGH   |
| 2          | Alice        |              |
| 3          | Bob          | DIAB100 MYOP |
| 4          | George       | ACNE DIAB100 |
| 5          | Alain        | DIAB201      |
+------------+--------------+--------------+
Output:
+------------+--------------+--------------+
| patient_id | patient_name | conditions   |
+------------+--------------+--------------+
| 3          | Bob          | DIAB100 MYOP |
| 4          | George       | ACNE DIAB100 |
+------------+--------------+--------------+
Explanation: Bob and George both have a condition that starts with DIAB1.
 */
/*
Solution:
select patient_id, patient_name,conditions
from Patients
where conditions like 'DIAB1%' OR conditions like '% DIAB1%'
 */
/*
Solution Regax
Going through different solutions, I didn't see anyone use a regular expression with a boundary. So, I decided to post one.

SELECT * FROM patients WHERE conditions REGEXP '\\bDIAB1'
The expression conditions REGEXP '\\bDIAB1' is actually the same as conditions LIKE '% DIAB1%' OR conditions LIKE 'DIAB1%';, but it is obviously shorter. 😉

The reason they are the same is that \b matches either a non-word character (in our case, a space) or the position before the first character in the string. Also, you need to escape a backslash with another backslash, like so: \\b. Otherwise, the regular expression won't evaluate.

P.S. \b also matches the position after the last character, but it doesn't matter in the context of this problem.
 */