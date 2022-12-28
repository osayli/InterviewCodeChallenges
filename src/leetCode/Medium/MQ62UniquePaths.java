package leetCode.Medium;

import java.math.BigInteger;

/*
There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.



Example 1:


Input: m = 3, n = 7
Output: 28
Example 2:

Input: m = 3, n = 2
Output: 3
Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down
 */
public class MQ62UniquePaths {

    public static int uniquePaths(int m, int n) {
        BigInteger multiply=BigInteger.ONE;
        for (int i = m+n-2; i >Integer.max(m-1,n-1) ; i--) {
            multiply=multiply.multiply(BigInteger.valueOf(i));
        }
        System.out.println(multiply);
        System.out.println((multiply.divide(fac(Integer.min(m-1,n-1)))));
    return (multiply.divide(fac(Integer.min(m-1,n-1)))).intValue();
    }

    public static BigInteger fac(int n){
        BigInteger factorial=BigInteger.ONE;
        for (int i = n; i >1; i--) {
           factorial=factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(fac(15));

        System.out.println(uniquePaths(16,16));

    }
}
