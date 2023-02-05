package leetCode.Medium;
/*
Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.



Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".


Constraints:

1 <= s.length, p.length <= 3 * 104
s and p consist of lowercase English letters.
 */

import java.util.ArrayList;
import java.util.List;

public class MQ438FindAllAnagramsInAString {

    public static List<Integer> findAnagrams(String s, String p) {
        //define table
        int[] arr = new int[128];
        //define pointers
        int right = 0, left = 0;
        //fill up the table
        char[] s_arr = s.toCharArray();
        char[] p_arr = p.toCharArray();
        for (char cur : p_arr) {
            arr[cur]++;
        }
        //define minLen
        int minLen = Integer.MAX_VALUE;
        //define counter
        int counter = 0;
        //define answer
        List<Integer> ans = new ArrayList<>();

        //check if there is anagram
        while (right < s_arr.length) {
            //expand the window
            char curChar = s_arr[right];
            if (--arr[curChar] >= 0) {
                counter++;
            }
            while (counter == p_arr.length) {
                int curWindow = right - left + 1;
                if (curWindow <= minLen) {
                    minLen = curWindow;
                    if(minLen==p_arr.length)
                        ans.add(left);
                }
                char leftChar = s_arr[left];
                if (++arr[leftChar] > 0) {
                    counter--;
                }
                left++;
            }
            right++;
        }
        return ans;
    }

    public static void main(String[] args) {

        String s="abab";
        String p="ab";
        System.out.println(findAnagrams(s,p));
    }
}
