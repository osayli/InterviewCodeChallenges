package leetCode.Easy;

import java.util.Arrays;

public class EQ389FindTheDifferenceBitManipulation {
    public static char findTheDifference(String s, String t) {
       String str=s+t;
       int n=0;
        for (int i = 0; i < str.length(); i++) {
          n^=str.charAt(i);
        }

        return (char)n;
    }

    public static void main(String[] args) {
        String s="abcd";
        String t="abcde";
        System.out.println(findTheDifference(s,t));
    }
}
