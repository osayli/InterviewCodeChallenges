package leetCode.Medium;

import java.util.Arrays;

/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]


Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105


Follow up:

Try to come up with as many solutions as you can. There are at least three different
ways to solve this problem. Could you do it in-place with O(1) extra space?
 */
public class MQ189RotateArray {
    public static int[] rotate(int[] nums, int k) {
        int len=nums.length;
        if(k>len){
            k%=len;
        }
        reverse(nums,0,len-k-1);
        reverse(nums,len-k,len-1);
        reverse(nums,0,len-1);
        return nums;
    }

    public static int[] reverse(int[] nums, int l,int r) {
     while(l<r){
         int temp=nums[l];
         nums[l]=nums[r];
         nums[r]=temp;
         l++;
         r--;
     }
     return nums;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        System.out.println(Arrays.toString(rotate(nums, k)));
    }
}
