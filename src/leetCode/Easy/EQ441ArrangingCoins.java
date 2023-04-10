package leetCode.Easy;
/*
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows
 where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.



Example 1:


Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.
Example 2:


Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.


Constraints:

1 <= n <= 231 - 1
 */
public class EQ441ArrangingCoins {

    public static int arrangeCoins(int n) {
     int left=1,right=n;
     while (left<=right){
         int mid =left+(right-left)/2;
         long check=((long) mid *(mid+1))/2;
         if(check>n)
             right=mid-1;
         else if (check<n)
             left=mid+1;
         else
             return mid;
     }

     return left-1;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));
    }
}
