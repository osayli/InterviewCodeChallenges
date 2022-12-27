package leetCode;

import java.util.Arrays;

public class EQ136SingleNumber {
    public static int singleNumber(int[] nums) {
    /* List<Integer> lst=new ArrayList<>(Arrays.asList(nums));
     return lst.get(0);*/
        int result=nums[0];
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i+=2) {
            if(nums[i-1]!=nums[i])
            return result=nums[i-1];
            if(i==nums.length-2)
            return result=nums[i+1];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] num={2,1,1};
        System.out.println(singleNumber(num));
    }
}
