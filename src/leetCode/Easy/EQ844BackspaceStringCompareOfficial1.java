package leetCode.Easy;

import java.util.Stack;

public class EQ844BackspaceStringCompareOfficial1 {
    public static boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public static String build(String S) {
        Stack<Character> ans = new Stack();
        for (char c: S.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }

    public static void main(String[] args) {
        String s="a##c";
        String t="#a#c";
        System.out.println(backspaceCompare(s,t));
    }
}
