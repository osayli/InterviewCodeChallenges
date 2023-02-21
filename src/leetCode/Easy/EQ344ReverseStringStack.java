package leetCode.Easy;

import java.util.Arrays;
import java.util.Stack;

public class EQ344ReverseStringStack {
    public static void reverseString(char[] s) {
        Stack<Character> st=new Stack<>();
        for (char c : s) {
            st.push(c);
        }
        System.out.println(st);
        char[] result=new char[s.length];
        for (int i = 0; i < s.length; i++) {
         result[i]=st.pop();
        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverseString(s);
    }
}
