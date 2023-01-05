package leetCode.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EQ217ContainsDuplicateUsingSorting {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}