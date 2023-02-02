package leetCode.Easy;
/*
For two strings s and t, we say "t divides s" if and only if s = t + ... + t
(i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.



Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""


Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.
 */
public class EQ1071GreatestCommonDivisorOfStrings {

    public static String gcdOfStrings(String str1, String str2) {
        String s="";
        int len1=str1.length(),len2=str2.length();
        if(len1>=len2)
            s=str2;
        else
            s=str1;
        while(!(str1.replaceAll(s,"").isEmpty()&&str2.replaceAll(s,"").isEmpty())){
           s=s.substring(0,s.length()-1);
           if(s.length()==0)
               return s;
        }

        return s;
    }

    public static void main(String[] args) {
        String str1="LEET";
        String str2="CODE";
        System.out.println(gcdOfStrings(str1,str2));
    }
}
