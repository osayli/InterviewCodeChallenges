package leetCode.Easy;

import java.util.Arrays;

public class EQ1470ShuffleTheArrayOfficial {


    public static int[] shuffle(int[] nums, int n) {
        int[] result=new int[2*n];
        for (int i = 0; i < n; i++) {
            result[2*i]=nums[i];
            result[2*i+1]=nums[n+i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
}
/*
Shuffle the Array

Solution
Overview
We are given an array numsnumsnums with 2∗n elements, [x1, x2, ... , xn, y1 , y2, ... , yn][ x_1, \space x_2, \space ... \space , \space x_n, \space y_1 \space, \space y_2 , \space ... \space , \space y_n ][x
1
​
 , x
2
​
 , ... , x
n
​
 , y
1
​
  , y
2
​
 , ... , y
n
​
 ].
We need to rearrange the original array as, [x1, y1, x2, y2, ...... , xn, yn][ x_1, \space y_1, \space x_2, \space y_2, \space ...... \space, \space x_n, \space y_n ][x
1
​
 , y
1
​
 , x
2
​
 , y
2
​
 , ...... , x
n
​
 , y
n
​
 ].

show_using_image

Approach 1: Simple Iteration
Intuition
Let us start by trying to identify some patterns in the original array, The elements from x1x_1x
1
​
  to xnx_nx
n
​
  exist from indices 000 to n−1n - 1n−1 and elements from y1y_1y
1
​
  to yny_ny
n
​
  from indices nnn to 2∗n−12 * n - 12∗n−1. The elements of xxx should be placed at indices 0, 2, 4, .... At nums[i] we have element xi+1x_{i + 1}x
i+1
​
 , we should place it at index 2∗i2 * i2∗i for all 0≤i<n0 \le i \lt n0≤i<n.

The elements of yyy should be placed at indices 1, 3, 5, .... At nums[n + i] we have element yi+1y_{i + 1}y
i+1
​
 , we should place it at index 2∗i+12 * i + 12∗i+1 for all 0≤i<n0 \le i \lt n0≤i<n. Notice that it is the same formula as the previous one but with a +1, indicating that elements of yyy come after elements of xxx.

places

One of the intuitive ways to solve this is to have an extra array result\text{result}result of size 2∗n2 * n2∗n, then iterate over nums\text{nums}nums and place each of its elements at the respective positions in result\text{result}result.

Algorithm
Build an array result of size 2 * n.
Iterate over the nums array ranging from indices 0 to n - 1:
Store the element xi+1x_{i + 1}x
i+1
​
  , that is, nums[i] at index 2 * i,
and element yi+1y_{i + 1}y
i+1
​
  , that is, nums[i + n] at index 2 * i + 1 in result.
Return the result array.
Implementation

Complexity Analysis
Here, 2∗n2 * n2∗n is the number of elements in the nums array.

Time complexity: O(n)O(n)O(n).
We iterate on nnn elements of the nums array, which takes us O(n)O(n)O(n) time.
Initializing the result array will take O(2n)O(2n)O(2n) time.
Thus, overall we take O(n+2n)=O(n)O(n + 2n) = O(n)O(n+2n)=O(n) time.
Space complexity: O(1)O(1)O(1).
We are not using any additional space other than the output array.

Approach 2: In-place Filling
Intuition
The previous approach is optimal and sufficient for most interviews. But sometimes the interviewer might come up with a follow-up to perform the changes in-place in the input array without using an output array.

This approach is much more difficult than the previous one and is included for completeness. Don't be discouraged if you aren't able to come up with it yourself.

So, we can't store the numbers in some additional space. Additionally, rewriting a number will erase the previous value. Hence, here the interviewer would like to check our understanding of bit manipulation.

  If you are not aware of bit manipulation first, let's get a brief idea about it and look at some basic bitwise operators. (click to expand)

Now coming back to our problem, we can see that the maximum possible value of an element of the numsnumsnums array is 10310^310
3
  which is 111110100011111010001111101000 in binary.
Thus each element will take at most 101010-bits in a 323232-bit integer and the remaining bits are 000 and not used.

This suggests the idea that in the remaining empty unused bits we can store some extra information. One possible solution is storing two numbers together (the first number in the first ten bits and the second in the next ten bits) without using additional space.

together

We will store the last nnn numbers with the first nnn numbers of the numsnumsnums array. Thus, xix_ix
i
​
  and yiy_iy
i
​
  are stored at ithi^{th}i
th
  index.

And then we can store the numbers at their respective positions after starting iteration on the stored pairs from index (n−1)(n - 1)(n−1) to index 000.
We would like to move in this direction (right to left) because, even if the right side elements are overwritten, we will not use those overwritten elements again because the current index (iii) having a number pair will always be less or equal to the updated cells (i<=2∗ii <= 2 * ii<=2∗i and 2∗i+12 * i + 12∗i+1).
Thus, the overwritten elements would have already been placed at their correct positions earlier.

map_array

Storing two numbers together:

aaa is the first number, bbb is the second number.

We can left shift bbb by 101010 bits and take its bitwise-OR with aaa.
When we take any bit's bitwise-OR with 000, it results in the same bit, and 111 results in 111.

The first 101010 bits in bnewb_{new}b
new
​
  are 000. So, when we take its bitwise-OR with aaa, the result's first 101010 bits will have aaa's 101010 bits, and the next 101010 bits of aaa are 000, so the result's next 101010 will store bbb's 101010 bits there.
Thus the final result has bits of both aaa and bbb.

store

Extracting both numbers:

result\text{result}result is the number having both numbers, aaa (first number) and, bbb (second number).

result\text{result}result's first 101010 bits contain aaa. Thus, we can retrieve it by taking bitwise-AND with 0000000000 11111111110000000000 \space 11111111110000000000 1111111111 (102310231023 in decimal).
When we take a bit's AND with 111 it results in the same bit and with 000 results in 000.

result\text{result}result's next 101010 bits contain bbb, thus we can retrieve it by right shifting it by 101010 bits.

extract

Algorithm
Iterate on the nums array from index i = n to 2 * n - 1:
Store the element yi+1y_{i + 1}y
i+1
​
 , that is, nums[i] with xi+1x_{i + 1}x
i+1
​
  at index (i - n), using bit manipulation as discussed previously.
Iterate from index n - 1 to 0, and at each index i:
Extract both firstNumber and secondNumber using bit manipulation and store them at their respective indices 2 * i and 2 * i + 1 in the nums array.
Return the nums array.
Implementation

Complexity Analysis
Here, 2∗n2 * n2∗n is the number of elements in the nums array.

Time complexity: O(n)O(n)O(n).
We only iterate on the nnn elements of the nums array twice, which takes us O(n)O(n)O(n) time.
Space complexity: O(1)O(1)O(1).
We are not using any additional space.

 */