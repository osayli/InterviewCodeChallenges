package leetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class MQ003LongestSubstringWithoutRepeatingCharacters {
    /*
    Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    public static int lengthOfLongestSubstring(String s) {
        List<Character> result=new ArrayList<>();
        List<Character> temp=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(!temp.contains(s.charAt(i))){
                temp.add(s.charAt(i));
            }else{
                if(result.size()<temp.size()) {
                    result.clear();
                    result.addAll(temp);
                    temp.clear();
                    temp.add(s.charAt(i));
                }
            }

        }
        if(result.size()<temp.size()){
            result.clear();
            result.addAll(temp);
        }
        return result.size();

    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("au"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(" "));
    }
}
