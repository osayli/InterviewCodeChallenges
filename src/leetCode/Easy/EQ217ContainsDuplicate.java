package leetCode.Easy;

import java.util.HashSet;
import java.util.Set;

public class EQ217ContainsDuplicate {
    /*
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
     */
    public static boolean containsDuplicate(int[] nums) {
     Set<Integer> uniques=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!uniques.add(nums[i]))
                return true;
            uniques.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}
