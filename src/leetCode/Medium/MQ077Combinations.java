package leetCode.Medium;

import java.util.ArrayList;
import java.util.List;

/*
Given two integers n and k, return all possible combinations of k numbers chosen
from the range [1, n].

You may return the answer in any order.



Example 1:

Input: n = 4, k = 2
Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
Explanation: There are 4 choose 2 = 6 total combinations.
Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same
 combination.
Example 2:

Input: n = 1, k = 1
Output: [[1]]
Explanation: There is 1 choose 1 = 1 total combination.


Constraints:

1 <= n <= 20
1 <= k <= n
 */
public class MQ077Combinations {

    public static List<List<Integer>> combine(int n, int k) {

        if(k>n) return new ArrayList<>();

        List<List<Integer>> result=new ArrayList<>();

        combine(1,n,k, new ArrayList<>(),result);

        return result;
    }

    private static void combine(int i, int n, int k,List<Integer> comb, List<List<Integer>>  result){
     if(k==0){
         result.add(new ArrayList<>(comb));
         return;
     }
        for (int j = i; j <=n; j++) {
         comb.add(j);
         combine(j+1,n,k-1,comb,result);
         comb.remove(comb.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
}
