package leetCode.Medium;
/*
Given an array of positive integers nums and a positive integer target, return the
minimal length of a sub-array whose sum is greater than or equal to target.
If there is no such subarray, return 0 instead.



Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0


Constraints:

1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104
 */
public class MQ209MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int left=0,total=0;
        int min=Integer.MAX_VALUE;
            for (int i =0; i < nums.length; i++) {
                total+=nums[i];
                while(total>=target){
                    min=Math.min(min,i-left+1);
                    total-=nums[left];
                    left++;
                }
        }

        return min==Integer.MAX_VALUE ? 0:min;
    }

    public static void main(String[] args) {
        int[] nums={1,4,4};
        int target=4;
        System.out.println(minSubArrayLen(target,nums));
    }
}
