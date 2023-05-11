package leetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class EQ1876SubstringsOfSizeThreeWithDistinctCharacters {

    public static int countGoodSubstrings(String s) {

        int len=s.length();
        int window=3;
        int ans=0;
        int left=0,right=0;

        while(right<len){
            if(right-left+1<window){
                right++;
            }else if(right-left+1==window){
                if(s.charAt(left)!=s.charAt(left+1) &&s.charAt(left+1)!=s.charAt(left+2) && s.charAt(left)!=s.charAt(left+2)){
                    ans++;
                }
                left++;
                right++;
            }
        }
        return  ans;
    }

    public static void main(String[] args) {

        String s="aababcabc";
        System.out.println(countGoodSubstrings(s));
    }
}
