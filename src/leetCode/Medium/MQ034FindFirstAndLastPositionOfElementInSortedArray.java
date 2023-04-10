package leetCode.Medium;

import java.util.Arrays;

/*
Given an array of integers nums sorted in non-decreasing order, find the starting and
ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]


Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
 */
public class MQ034FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length;
        while (left<right){
            int mid= left+(right-left)/2;
            if(nums[mid]>target)
                right=mid;
            else if (nums[mid]<target)
                left=mid+1;
            else{
                left=mid-1;
                right=mid+1;
                while(left>=0&&nums[left]==target){
                    left--;
            }
                while(right<nums.length&&nums[right]==target){
                    right++;
                }
                return new int[]{left+1,right-1};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums={1,8,8};
        int target=8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
