package leetCode.Easy;

import java.util.Stack;

public class EQ058LengthOfLastWordOtherSolution {
    public static int lengthOfLastWord(String s) {
        Stack<Character> s1=new Stack<>();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            s1.push(s.charAt(i));
        }

        while (s1.peek()==' ') s1.pop();

        while (!s1.isEmpty() && s1.peek()!=' '){
            count++;
            s1.pop();
        }

        return count;
    }

    public static void main(String[] args) {
        String s= "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
