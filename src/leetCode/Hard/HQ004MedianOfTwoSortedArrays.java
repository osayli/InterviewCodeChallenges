package leetCode.Hard;
/*
Given two sorted arrays nums1 and nums2 of size m and n respectively,
return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-10^6 <= nums1[i], nums2[i] <= 10^6
 */
public class HQ004MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;

        if(len2>len1)
            return findMedianSortedArrays(nums2,nums1);

        int lo=0,hi=len1;

        while (lo<=hi){
            int part1=lo+(hi-lo)/2;
            int part2=(len1+len2+1)/2-part1;

            int maxLeft1=part1==0 ? Integer.MIN_VALUE :nums1[part1-1];
            int maxLeft2=part2==0 ? Integer.MIN_VALUE :nums2[part2-1];

            int minRight1=part1==len1 ? Integer.MAX_VALUE: nums1[part1];
            int minRight2=part2==len2 ? Integer.MAX_VALUE: nums2[part2];

            if(maxLeft1<=minRight2 &&maxLeft2<=minRight1)
                return (len1+len2)%2==0 ?(Math.max(maxLeft1,maxLeft2)+Math.min(minRight1,minRight2))
                        :Math.max(maxLeft1, maxLeft2);
            else if(maxLeft1>maxLeft2)
                hi=part1-1;
            else
                lo=part1+1;
        }

        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] nums2={2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
