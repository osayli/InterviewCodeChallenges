package leetCode.Medium;
/*
Given a non-negative integer c, decide whether there are two integers a and b such that a2 + b2 = c.



Example 1:

Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
Example 2:

Input: c = 3
Output: false


Constraints:

0 <= c <= 231 - 1
 */
public class MQ633SumOfSquareNumbers {
    public static boolean judgeSquareSum(int c) {

    int left=0,right=(int)Math.sqrt(c);

    while(left<=right){
      long sum = (long) left *left+ (long) right *right;
      if(sum==c)
          return true;
      if(sum<c)
          left++;
      else
          right--;
    }
        return false;
    }

    public static void main(String[] args) {
    int c=2147483600;
        System.out.println(judgeSquareSum(c));
    }
}
