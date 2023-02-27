package leetCode.Easy;

import java.util.Arrays;

public class EQ027RemoveElement2ndTry {
    public static int removeElement(int[] nums, int val) {
        int index=0;
        for (int i = 0; i <nums.length; i++) {
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int k = removeElement(nums, 2);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }
}
