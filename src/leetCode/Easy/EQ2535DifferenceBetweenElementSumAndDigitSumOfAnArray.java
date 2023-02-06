package leetCode.Easy;
/*
You are given a positive integer array nums.

The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.

Note that the absolute difference between two integers x and y is defined as |x - y|.



Example 1:

Input: nums = [1,15,6,3]
Output: 9
Explanation:
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
Example 2:

Input: nums = [1,2,3,4]
Output: 0
Explanation:
The element sum of nums is 1 + 2 + 3 + 4 = 10.
The digit sum of nums is 1 + 2 + 3 + 4 = 10.
The absolute difference between the element sum and digit sum is |10 - 10| = 0.


Constraints:

1 <= nums.length <= 2000
1 <= nums[i] <= 2000
 */
public class EQ2535DifferenceBetweenElementSumAndDigitSumOfAnArray {

    public static int differenceOfSum(int[] nums) {
        int diff=0;
        for (int i = 0; i < nums.length; i++) {
           if(nums[i]>9||nums[i]<-9){
               diff+=(nums[i]-diff(nums[i]));
           }
        }
        return diff;
    }

    public static int diff(int nums) {
        int sumDigit=0;
        while (nums!=0){
          sumDigit+=nums%10;
          nums/=10;
        }
        return sumDigit;
    }

    public static void main(String[] args) {
        int[] nums={1,2,6,3};
        System.out.println(differenceOfSum(nums));
    }
}
