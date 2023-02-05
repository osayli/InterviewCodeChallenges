package leetCode.Hard;
/*
Given two strings s and t of lengths m and n respectively, return the minimum window
substring
 of s such that every character in t (including duplicates) is included in the window.
 If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.



Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
Example 3:

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.


Constraints:

m == s.length
n == t.length
1 <= m, n <= 105
s and t consist of uppercase and lowercase English letters.


Follow up: Could you find an algorithm that runs in O(m + n) time?
 */
public class HQ076MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        //define table
        int[] arr=new int[128];
        char[] s_arr=s.toCharArray();
        char[] t_arr=t.toCharArray();
        //increment each character in t by one
         for(char c:t_arr){
          arr[c]++;
         }
         //define pointers
        int left=0,right=0;
         //define minLen
        int minLen=Integer.MAX_VALUE;
        //define ans
        String ans="";
        int counter=0;
        //find the minimum window
        while (right<s_arr.length){
            //expand window
          char curChar=s_arr[right];
          if(--arr[curChar]>=0){
              counter++;
          }
          //shrink window
            while (counter==t_arr.length){
                int curWindow=right-left+1;
                if(curWindow<minLen){
                    minLen=curWindow;
                    ans=s.substring(left,right+1);
                }
                char leftChar=s_arr[left];
                if(++arr[leftChar]>0){
                    counter--;
                }
                left++;
            }
          right++;
        }
        //return answer
        return ans;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s,t));
    }
}
