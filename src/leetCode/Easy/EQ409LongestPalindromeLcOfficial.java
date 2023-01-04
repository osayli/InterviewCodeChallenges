package leetCode.Easy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EQ409LongestPalindromeLcOfficial {
    public static int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s="abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
