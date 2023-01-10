package leetCode.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EQ001TwoSumHashMap {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        int[] nums={3,2,4};
        int target=7;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
