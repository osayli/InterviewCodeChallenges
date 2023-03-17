package leetCode.Easy;

import java.util.Arrays;

/*
Given a string s, return the string after replacing every uppercase letter with the same
 lowercase letter.



Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"


Constraints:

1 <= s.length <= 100
s consists of printable ASCII characters.
 */
public class EQ709ToLowerCase {
    public static String toLowerCase(String s) {
        //   return s.toLowerCase();
        char[] char_s = s.toCharArray();
        for (int i = 0; i < char_s.length; i++) {
            if (char_s[i] >= 'A' && char_s[i] <= 'Z')
                char_s[i] = (char) (char_s[i] - 'A' + 'a');
        }
        return String.valueOf(char_s);
    }

    public static void main(String[] args) {
        String s="Hello";
        System.out.println(toLowerCase(s));
        }
}
