package leetCode.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
You are given two strings s1 and s2 of equal length. A string swap is an operation where you
 choose two indices in a string (not necessarily different) and swap the characters at these
 indices.

Return true if it is possible to make both strings equal by performing at most one string
 swap on exactly one of the strings. Otherwise, return false.



Example 1:

Input: s1 = "bank", s2 = "kanb"
Output: true
Explanation: For example, swap the first character with the last character of s2 to make "bank".
Example 2:

Input: s1 = "attack", s2 = "defend"
Output: false
Explanation: It is impossible to make them equal with one string swap.
Example 3:

Input: s1 = "kelb", s2 = "kelb"
Output: true
Explanation: The two strings are already equal, so no string swap operation is required.


Constraints:

1 <= s1.length, s2.length <= 100
s1.length == s2.length
s1 and s2 consist of only lowercase English letters.
 */
public class EQ1790CheckIfOneStringSwapCanMakeStringsEqual {
    public static boolean areAlmostEqual(String s1, String s2) {

        int len=s1.length();
        int count=0;
        for (int i = 0; i < len; i++) {
            if (!s2.contains(s1.substring(i, i + 1))) {
                return false;
            } else if(s2.charAt(i)==s1.charAt(i)) {
                count++;
            }
        }
        char[] arr1=s1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr2);
        if(!Arrays.equals(arr1, arr2))
            return false;
        return count == len - 2 || count == len;
    }

    public static void main(String[] args) {
        String s1="bank";
        String s2="kanb";
        System.out.println(areAlmostEqual(s1,s2));
    }
}
