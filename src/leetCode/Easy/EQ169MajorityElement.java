package leetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109


Follow-up: Could you solve the problem in linear time and in O(1) space?
 */
public class EQ169MajorityElement {

    public static int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int len=nums.length;
        int left=0, right=left+len/2;
        while(right<len){
            if(nums[left]==nums[right]){
                return nums[left];
            }else{
                left++;
                right++;
            }
        }
        return nums[len-1];
    }

    public static void main(String[] args) {

        int[] nums={3,3,4};
        System.out.println(majorityElement(nums));
    }
}
