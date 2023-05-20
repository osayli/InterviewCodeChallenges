package leetCode.Medium;

public class MQ209MinimumSizeSubArraySum2ndAttempt {
    public static int minSubArrayLen(int target, int[] nums) {
       int left=0;
       int len=nums.length;
       int minLen=len;
       int sum=0;

        for (int i = 0; i < len; i++) {

            sum+=nums[i];

            while(sum>=target){
                minLen=Math.min(minLen,i-left+1);
                sum-=nums[left];
                left++;
            }

        }
        return minLen;
    }

    public static void main(String[] args) {
        int[] nums={1,4,4};
        int target=4;
        System.out.println(minSubArrayLen(target,nums));
    }
}
