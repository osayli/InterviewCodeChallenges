package leetCode.Hard;

import java.util.ArrayList;
import java.util.List;

/*
You are given an integer array nums and two integers minK and maxK.

A fixed-bound subarray of nums is a subarray that satisfies the following conditions:

The minimum value in the subarray is equal to minK.
The maximum value in the subarray is equal to maxK.
Return the number of fixed-bound sub-arrays.

A subarray is a contiguous part of an array.



Example 1:

Input: nums = [1,3,5,2,7,5], minK = 1, maxK = 5
Output: 2
Explanation: The fixed-bound subarrays are [1,3,5] and [1,3,5,2].
Example 2:

Input: nums = [1,1,1,1], minK = 1, maxK = 1
Output: 10
Explanation: Every subarray of nums is a fixed-bound subarray. There are 10 possible sub-arrays.


Constraints:

2 <= nums.length <= 105
1 <= nums[i], minK, maxK <= 106
 */
public class HQ2444CountSubarraysWithFixedBounds {
    public static long countSubarrays(int[] nums, int minK, int maxK) {
        long result=0;
       int idx=-1;
       int idxMinK=-1;
       int idxMaxK=-1;

        for (int i = 0; i < nums.length; i++) {
         if(nums[i]<minK || nums[i]>maxK){
             idx=i;
         }
         if(nums[i]==minK){
             idxMinK=i;
         }
         if(nums[i]==maxK){
             idxMaxK=i;
         }
            // any index k in [j + 1, min(prevMinKIndex, prevMaxKIndex)] can be the
            // start of the subarray s.t. nums[k..i] satisfies the conditions
        result+=Math.max(0,Math.min(idxMinK,idxMaxK)-idx);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums={1,3,5,2,7,5};
        int minK=1;
        int maxK=5;
        System.out.println(countSubarrays(nums,minK,maxK));
    }
}
