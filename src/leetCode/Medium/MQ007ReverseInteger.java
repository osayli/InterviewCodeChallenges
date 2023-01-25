package leetCode.Medium;

public class MQ007ReverseInteger {
    /*
    Given a signed 32-bit integer x, return x with its digits reversed.
    If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
     */

    public static int reverse(int x) {
        if(x==Integer.MIN_VALUE)
            return 0;
        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(x)));
        sb.reverse();
        long result=Long.parseLong(String.valueOf(sb));
        if(result>Integer.MAX_VALUE)
            return 0;
        return  Math.abs(x)==x ? (int)result:-1*(int)result;

    }

    public static void main(String[] args) {
        //System.out.println(Integer.MAX_VALUE);
        System.out.println(reverse(-2147483648));
    }
}
