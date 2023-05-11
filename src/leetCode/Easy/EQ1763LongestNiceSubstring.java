package leetCode.Easy;

import java.util.HashSet;
import java.util.Set;

public class EQ1763LongestNiceSubstring {
    public static String longestNiceSubstring(String s) {

        int len=s.length();
        int maxPos=0;
        int maxLen=0;

        for (int i = 0; i < len; i++) {
            int lower=0;
            int upper=0;

            for (int j = i; j <len ; j++) {
               if(Character.isLowerCase(s.charAt(j))){
                   lower|=1<<(s.charAt(j)-'a');
               }else{
                   upper|=1<<(s.charAt(j)-'A');
               }

               if(lower==upper && j-i+1>maxLen){
                   maxPos=i;
                   maxLen=j-i+1;
               }
            }
        }
        return s.substring(maxPos,maxPos+maxLen);
    }

    public static void main(String[] args) {
        String s="YazaAay";
        System.out.println(longestNiceSubstring(s));
    }
}
