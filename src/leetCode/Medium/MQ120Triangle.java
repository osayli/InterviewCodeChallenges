package leetCode.Medium;

import java.util.ArrayList;
import java.util.List;

/*
Given a triangle array, return the minimum path sum from top to bottom.

For each step, you may move to an adjacent number of the row below. More formally,
 if you are on index i on the current row, you may move to either index i or
 index i + 1 on the next row.



Example 1:

Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
Output: 11
Explanation: The triangle looks like:
   2
  3 4
 6 5 7
4 1 8 3
The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
Example 2:

Input: triangle = [[-10]]
Output: -10


Constraints:

1 <= triangle.length <= 200
triangle[0].length == 1
triangle[i].length == triangle[i - 1].length + 1
-104 <= triangle[i][j] <= 104
 */
public class MQ120Triangle {

    public static int minimumTotal(List<List<Integer>> triangle) {
        int row=triangle.size();
        int col=triangle.get(row-1).size();
        int[][] dp=new int[row+1][col+1];
        for (int i =row-1; i >=0 ; i--) {
            for (int j = 0; j <triangle.get(i).size() ; j++) {
                dp[i][j]= triangle.get(i).get(j)+ Math.min(dp[i+1][j], dp[i+1][j+1]);
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {

        List<Integer> one=new ArrayList<>();
        one.add(2);

        List<Integer> two=new ArrayList<>();
        two.add(3);
        two.add(4);
        List<Integer> three=new ArrayList<>();
        three.add(6);
        three.add(5);
        three.add(7);

        List<Integer> four=new ArrayList<>();
        four.add(4);
        four.add(1);
        four.add(8);
        four.add(3);
        List<List<Integer>> triangle=new ArrayList<>();
        triangle.add(one);
        triangle.add(two);
        triangle.add(three);
        triangle.add(four);
        System.out.println(triangle);
        System.out.println(minimumTotal(triangle));

    }
}
