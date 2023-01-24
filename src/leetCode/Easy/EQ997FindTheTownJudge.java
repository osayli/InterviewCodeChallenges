package leetCode.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EQ997FindTheTownJudge {
    /*
    In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi.

Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.



Example 1:

Input: n = 2, trust = [[1,2]]
Output: 2
Example 2:

Input: n = 3, trust = [[1,3],[2,3]]
Output: 3
Example 3:

Input: n = 3, trust = [[1,3],[2,3],[3,1]]
Output: -1
     */

    public static int findJudge(int n, int[][] trust) {
        List<Integer> result=new ArrayList<>();
        for (int i = 0; i < trust.length; i++) {
            result.add(trust[i][1]);
        }
        System.out.println(result);
        for (int i = 1; i <= n ; i++) {
          if(Collections.frequency(result,i)==n-1)
              return i;
        }
        return -1;
    }

    public static void main(String[] args) {
      int[][] trust={{1,3},{2,3},{3,1}};
      int n=3;
        System.out.println(findJudge(n,trust));
    }
}