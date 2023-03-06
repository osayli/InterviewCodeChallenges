package leetCode.Easy;

import java.util.ArrayList;
import java.util.List;

/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.



Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.


Constraints:

1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length
 */
public class EQ1539KthMissingPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
        int len=arr.length;
        List<Integer> ls=new ArrayList<>();
        for(int i: arr){
            ls.add(i);
        }
        int flag=0;
        for (int i = 1; i <arr[arr.length-1] ; i++) {
            if(!ls.contains(i)){
               flag++;
            }
            if(flag==k){
                return i;
            }
        }
        return arr[len-1]+k-flag;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int k=2;
        System.out.println(findKthPositive(arr,k));
    }
}
