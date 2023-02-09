package leetCode.Medium;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;

/*
You are given a 0-indexed array of integers nums of length n.
You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i.
 In other words, if you are at nums[i], you can jump to any nums[i + j] where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach nums[n - 1].
The test cases are generated such that you can reach nums[n - 1].



Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2.
Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [2,3,0,1,4]
Output: 2


Constraints:

1 <= nums.length <= 104

 */
public class MQ045JumpGameII {
    public static int jump(int[] nums) {
        int n=nums.length;
        int[] minJump=new int[n];
        Arrays.fill(minJump,Integer.MAX_VALUE);
        minJump[n-1]=0;

        for (int i = n-2; i >=0 ; i--) {
            int min= Integer.MAX_VALUE;
            for (int j =i+1; j<=Math.min(n-1,i+nums[i]) ; j++) {
             min=Math.min(min,minJump[j]);
            }
            if(min!=Integer.MAX_VALUE){
                minJump[i]=min+1;
            }
        }
        return minJump[0];
    }

    public static void main(String[] args) {
        int[] num={1,2,1,1,1};
        System.out.println(jump(num));
    }
}
