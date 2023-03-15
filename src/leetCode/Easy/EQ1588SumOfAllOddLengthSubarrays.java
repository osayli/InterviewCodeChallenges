package leetCode.Easy;
/*
Given an array of positive integers arr, return the sum of all possible
odd-length subarrays of arr.

A subarray is a contiguous subsequence of the array.



Example 1:

Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
Example 2:

Input: arr = [1,2]
Output: 3
Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
Example 3:

Input: arr = [10,11,12]
Output: 66
 */
public class EQ1588SumOfAllOddLengthSubarrays {
    public static int sumOddLengthSubarrays(int[] arr) {
        int left=0,right=arr.length-1;
        int sum=0;
        while(left<right) {
           /* for (int i = left; i < r) {
             sum+=arr[i];
            }*/
        }
        return 9;
    }

    public static void main(String[] args) {
        int[] arr={1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
}
