package leetCode.Medium;

import java.util.Arrays;
import java.util.Stack;

public class MQ394DecodeString {
    /*
    Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.



Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
     */

    public static String decodeString(String s) {
        Stack<Character> stack = new Stack<Character>();
        String result="";
        String[] ss=s.split("]");
        //String[] ss=s.split("\\W");
        System.out.println(Arrays.toString(ss));
        int count=1;
        //s=s.replace(s.substring(s.lastIndexOf("["),s.indexOf("]")+1),s.charAt(s.indexOf("]")));
        for (char c:s.toCharArray()){
            if(Character.isDigit(c)){
                count=Integer.valueOf(c);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s="3[a]2[bc]";
        System.out.println(decodeString(s));
    }
}
