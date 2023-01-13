package leetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EQ35SearchInsertPosition {
    /*
    Given a sorted array of distinct integers and a target value,
    return the index if the target is found. If not, return the index
     where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
     */
    public static int searchInsert(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        if(list.contains(target))
            return list.indexOf(target);
        else{
            list.add(target);
            Collections.sort(list);
            return list.indexOf(target);
        }
        
    }

    public static void main(String[] args) {
int[] nums={1,3,5,6};
int target=7;
        System.out.println(searchInsert(nums,target));
    }
}
