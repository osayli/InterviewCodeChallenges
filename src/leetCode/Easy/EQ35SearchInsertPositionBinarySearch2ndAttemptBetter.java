package leetCode.Easy;

public class EQ35SearchInsertPositionBinarySearch2ndAttemptBetter {
    public static int searchInsert(int[] nums, int target) {
       int left=0,right=nums.length;
       while (left<right){
           int mid=left+(right-left)/2;
           if(nums[mid]==target)
               return mid;
           else if(nums[mid]>target)
               right=mid;
           else
               left=mid+1;
       }

       return left;
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=7;
        System.out.println(searchInsert(nums,target));
    }
}
