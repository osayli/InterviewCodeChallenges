package leetCode.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EQ35SearchInsertPositionBinarySearch {
    public static int searchInsert(int[] nums, int target) {
    int start=0;
    int finish=nums.length-1;

    while (start<=finish){
        int middle=start-(start-finish)/2;
        if(nums[middle]==target)
            return middle;
        else if(nums[middle]>target)
            finish=middle-1;
        else
            start=middle+1;
    }
        return start;
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=7;
        System.out.println(searchInsert(nums,target));
    }
}
