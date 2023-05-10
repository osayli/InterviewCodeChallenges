package leetCode.Easy;

import java.util.HashMap;
import java.util.Map;

/*
A string is good if there are no repeated characters.

Given a string s, return the number of good substrings of length three in s.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A substring is a contiguous sequence of characters in a string.



Example 1:

Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
The only good substring of length 3 is "xyz".
Example 2:

Input: s = "aababcabc"
Output: 4
Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".


Constraints:

1 <= s.length <= 100
s consists of lowercase English letters.
 */
public class EQ1876SubstringsOfSizeThreeWithDistinctCharacters {

    public static int countGoodSubstrings(String s) {

        int len=s.length();
        int window=3;
        int ans=0;

        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <window ; i++) {
           if (map.get(s.charAt(i))==null){
               map.put(s.charAt(i),1);
           }else{
               map.put(s.charAt(i),map.get(s.charAt(i)+1));
           }
        }

        if(map.size()==window)
            ans++;

        for (int i = window; i < len; i++) {

            if(map.get(s.charAt(i))==null){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }

            map.put(s.charAt(i-window),map.get(s.charAt(i-window))-1);

            if(map.get(s.charAt(i-window))==0){
                map.remove(s.charAt(i-window));
            }

            if(map.size()==window)
                ans++;
        }
        return  ans;
    }

    public static void main(String[] args) {

        String s="aababcabc";
        System.out.println(countGoodSubstrings(s));
    }
}
