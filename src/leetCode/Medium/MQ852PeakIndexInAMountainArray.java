package leetCode.Medium;

import java.util.Arrays;

/*
An array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.



Example 1:

Input: arr = [0,1,0]
Output: 1
Example 2:

Input: arr = [0,2,1,0]
Output: 1
Example 3:

Input: arr = [0,10,5,2]
Output: 1


Constraints:

3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.
 */
public class MQ852PeakIndexInAMountainArray {

    public static int peakIndexInMountainArray(int[] arr) {
      int left=0,right=arr.length-1;

      while(left<right){
        int mid=left+(right-left)/2;
        if(arr[mid+1]>=arr[mid])
            left=mid+1;
        else
            right=mid;
      }
      return left;
    }

    public static void main(String[] args) {
        int[] arr={0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
