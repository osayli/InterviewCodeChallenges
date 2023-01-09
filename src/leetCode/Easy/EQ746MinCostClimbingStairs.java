package leetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EQ746MinCostClimbingStairs {
/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.



Example 1:

Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.
Example 2:

Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.
 */
    public static int minCostClimbingStairs(int[] cost) {
        int length=cost.length;

        int []term = new int [length+1];
        System.out.println(Arrays.toString(term));
        term[0]=cost[0];
        System.out.println(Arrays.toString(term));
        term[1]=cost[1];
        System.out.println(Arrays.toString(term));
        for (int i = 2; i < length; i++) {
            term[i] = Math.min(term[i-1],term[i-2])+cost[i];
            System.out.println(Arrays.toString(term));
        }
        term[length]=Math.min(term[length-1],term[length-2]);

       return  term[length];
    }

    public static void main(String[] args) {
        int[] cost={10,15,20};
        System.out.println(minCostClimbingStairs(cost));
    }

}
