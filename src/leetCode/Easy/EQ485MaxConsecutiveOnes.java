package leetCode.Easy;
/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.



Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2


Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
 */
public class EQ485MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int cons=0;
        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                temp++;
                cons=Math.max(temp,cons);
            }else{
                temp=0;
            }
        }
        return cons;
    }

    public static void main(String[] args) {
        int[] nums={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
