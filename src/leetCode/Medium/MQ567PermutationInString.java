package leetCode.Medium;

import java.util.HashSet;
import java.util.Set;

/*
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.



Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false


Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.
 */
public class MQ567PermutationInString {


    public static boolean checkInclusion(String s1, String s2) {
       //define table
        int[] arr=new int[128];
        //define pointers
        int right=0, left=0;
        //fill up table
        char[] s1Arr=s1.toCharArray();
        char[] s2Arr=s2.toCharArray();
        for(char cur:s1Arr){
            arr[cur]++;
        }
        //define minLen
        int minLen=Integer.MAX_VALUE;
        //define counter
        int counter=0;
        //check if there is permutation
        while (right<s2Arr.length){
          //expand our window
            int curChar=s2Arr[right];
            if(--arr[curChar]>=0) {
                counter++;
            }
          //shrink window
          while (counter==s1.length()){
              int curLen=right-left+1;
              minLen=Math.min(curLen,minLen);
              char leftChar=s2Arr[left];
              if(++arr[leftChar]>0){
                  counter--;
              }
              left++;
          }
          right++;
            }
        //return if minLen==size of s1
        return minLen==s1.length();
    }

    public static void main(String[] args) {
        String s2="bcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefg";
        String s1="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab" + "cdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdef";
        System.out.println(checkInclusion(s1,s2));
    }
}
