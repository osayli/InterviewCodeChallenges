package leetCode.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class EQ205IsomorphicStringsAnotherSolution2 {
    public static boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("baa","bcr"));
    }
}
