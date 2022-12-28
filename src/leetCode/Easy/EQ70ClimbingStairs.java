package leetCode.Easy;

public class EQ70ClimbingStairs {
    static  int []term = new int [1000];
    public static int climbStairs(int n) {
        term[0]=1;
        term[1]=1;
        if (term[n] != 0)
            return term[n];
        else
        {
            term[n] = climbStairs(n-1)+climbStairs(n-2);
            return term[n];
        }
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }
}

/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */
