package leetCode.Easy;

import java.util.Arrays;

/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 starting with word1. If a string is longer than the other, append the additional letters onto the
  end of the merged string.

Return the merged string.



Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q
merged: a p b q c   d


Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.
 */
public class EQ1768MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        StringBuilder merge= new StringBuilder();
        for (int i = 0; i < Math.max(len1,len2); i++) {
            if(i<len1){
                merge.append(word1.charAt(i));
            }

            if(i<len2){
                merge.append(word2.charAt(i));
            }
        }
    return merge.toString();
    }

    public static void main(String[] args) {
        String word1="abcd";
        String word2="pq";
        System.out.println(mergeAlternately(word1,word2));
    }
}
