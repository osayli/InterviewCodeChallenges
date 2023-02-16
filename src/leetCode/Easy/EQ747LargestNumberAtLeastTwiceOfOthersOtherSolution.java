package leetCode.Easy;

public class EQ747LargestNumberAtLeastTwiceOfOthersOtherSolution {
    public static int dominantIndex(int[] nums) {
        int[] max={Integer.MIN_VALUE,-1};
        int secondMax=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max[0]){
                secondMax=max[0];
                max[0]=nums[i];
                max[1]=i;
            }
            else if(nums[i]>secondMax){
                secondMax=nums[i];
            }
        }
        if(max[0]>=secondMax*2){
            return max[1];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={3,6,1,0};
        System.out.println(dominantIndex(nums));
    }
}
