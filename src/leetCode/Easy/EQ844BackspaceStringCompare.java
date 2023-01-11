package leetCode.Easy;

import java.util.Arrays;

public class EQ844BackspaceStringCompare {

    /*
    Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.



Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".


Constraints:

1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.


Follow up: Can you solve it in O(n) time and O(1) space?
     */

    public static boolean backspaceCompare(String s, String t) {
        while(s.contains("#")) {
            if(s.indexOf("#")==0) {
                s = s.substring(1);
                continue;
            }
            s = s.replace(s.substring(s.indexOf("#")-1, s.indexOf("#") + 1), "");
        }
        while (t.contains("#")){
            if(t.indexOf("#")==0) {
                t = t.substring(1);
                continue;
            }
            t = t.replace(t.substring(t.indexOf("#")-1, t.indexOf("#") + 1), "");
        }

        System.out.println(s);
        System.out.println(t);
        return s.equals(t);
    }

    public static void main(String[] args) {
        String s="a##c";
        String t="#a#c";
        System.out.println(backspaceCompare(s,t));
    }
}
