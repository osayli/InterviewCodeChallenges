-- 1683. Invalid Tweets
-- Table: Tweets

-- +----------------+---------+
-- | Column Name    | Type    |
-- +----------------+---------+
-- | tweet_id       | int     |
-- | content        | varchar |
-- +----------------+---------+
-- tweet_id is the primary key for this table.
-- This table contains all the tweets in a social media app.


-- Write an SQL query to find the IDs of the invalid tweets. The tweet is invalid if the number of characters used in the content of the tweet is strictly greater than 15.

-- Return the result table in any order.

-- The query result format is in the following example.



-- Example 1:

-- Input:
-- Tweets table:
-- +----------+----------------------------------+
-- | tweet_id | content                          |
-- +----------+----------------------------------+
-- | 1        | Vote for Biden                   |
-- | 2        | Let us make America great again! |
-- +----------+----------------------------------+
-- Output:
-- +----------+
-- | tweet_id |
-- +----------+
-- | 2        |
-- +----------+
-- Explanation:
-- Tweet 1 has length = 14. It is a valid tweet.
-- Tweet 2 has length = 32. It is an invalid tweet.

--  Solution

SELECT tweet_id
FROM Tweets
WHERE CHAR_LENGTH(content)>15;

--  Explanations

--  MySQL: LENGTH() is incorrect. Important difference between CHAR_LENGTH() vs LENGTH()

--  Using LENGTH() is incorrect. The question is asking for the number of characters used in the content.
 --  LENGTH() returns the length of the string measured in bytes. CHAR_LENGTH() returns the length
 --  of the string measured in characters.

 -- Reference:
 -- https://stackoverflow.com/questions/1734334/mysql-length-vs-char-length?rq=1

-- LENGTH() returns the length of the string measured in bytes.
-- CHAR_LENGTH() returns the length of the string measured in characters.
-- This is especially relevant for Unicode, in which most characters are encoded in two bytes, or UTF-8,
 -- where the number of bytes varies.

-- Example:

-- SELECT LENGTH('€')  # is equal to 3
-- SELECT CHAR_LENGTH('€') # is equal to 1
-- Important Note: Using LENGTH() will pass the testcases. If the testcases included characters such as
 -- € then it would fail as shown in the examples above.