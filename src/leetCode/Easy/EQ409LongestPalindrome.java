package leetCode.Easy;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EQ409LongestPalindrome {
    /*
    Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.



Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
     */
    public static int longestPalindrome(String s) {
        Map<String,Integer> counter=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!(counter.containsKey(s.substring(i,i+1)))){
               counter.put(s.substring(i,i+1),1);
            }else{
                counter.replace(s.substring(i,i+1),counter.get(s.substring(i,i+1))+1);
            }
        }
        System.out.println(counter);
        System.out.println(counter.values());
        Collection<Integer> values=counter.values();
        System.out.println(values);
        int result=0;
        int flag=0;
        for(Integer i:values){
            if(i%2==0)
                result+=i;
            else{
                result+=i-1;
            flag++;}
            }
        return result+(flag>0?1:0);
    }

    public static void main(String[] args) {
        String s="abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
