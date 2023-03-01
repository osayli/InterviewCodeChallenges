package leetCode.Medium;

import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import java.util.Arrays;

/*
Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity
and with the smallest space complexity possible.



Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example,
2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
Example 2:

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessairly unique.


Constraints:

1 <= nums.length <= 5 * 104
-5 * 104 <= nums[i] <= 5 * 104
 */
public class MQ912SortAnArray {
    public static int[] sortArray(int[] nums) {
       /* for (int i = 0; i < nums.length; i++) {
            for (int j = i; j>0 &&nums[j]<nums[j-1]; --j) {
                   int temp=nums[j];
                   nums[j]=nums[j-1];
                   nums[j-1]=temp;
            }
        }
        return nums;*/
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    public static void quickSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        while(start<=end){
            while (arr[start]<pivot){
                start++;
            }
            while (arr[end]> pivot){
              end--;
            }
            if(start<=end){
              int temp=arr[start];
              arr[start]=arr[end];
              arr[end]=temp;
              start++;
              end--;
            }
        }
        quickSort(arr,low,end);
        quickSort(arr,start,high);
    }

    public static void main(String[] args) {
        int[] nums={5,2,3,1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
