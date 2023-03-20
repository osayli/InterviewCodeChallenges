package leetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.


Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.


Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */
public class EQ242ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        List<String> sList= new ArrayList<>(Arrays.stream(s.split("")).toList());
        Collections.sort(sList);
        List<String> tList= new ArrayList<>(Arrays.stream(t.split("")).toList());
        Collections.sort(tList);
        return sList.equals(tList);
    }

    public static void main(String[] args) {
        String s="rat";
        String t="car";
        System.out.println(isAnagram(s,t));
    }

}
