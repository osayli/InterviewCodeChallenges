package leetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
You are given an integer array arr. Sort the integers in the array in ascending order
 by the number of 1's in their binary representation and in case of two or more integers
  have the same number of 1's you have to sort them in ascending order.

Return the array after sorting it.



Example 1:

Input: arr = [0,1,2,3,4,5,6,7,8]
Output: [0,1,2,4,8,3,5,6,7]
Explantion: [0] is the only integer with 0 bits.
[1,2,4,8] all have 1 bit.
[3,5,6] have 2 bits.
[7] has 3 bits.
The sorted array by bits is [0,1,2,4,8,3,5,6,7]
Example 2:

Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
Output: [1,2,4,8,16,32,64,128,256,512,1024]
Explantion: All integers have 1 bit in the binary representation,
you should just sort them in ascending order.


Constraints:

1 <= arr.length <= 500
0 <= arr[i] <= 104
 */
public class EQ1356SortIntegersByTheNumberOf1Bits {

    public static int[] sortByBits(int[] arr) {
        List<Integer> ordered=new ArrayList<>();
        int len=arr.length;
        for (int j : arr) {
            ordered.add(j);
        }

        Collections.sort(ordered,(x,y)->{
            int xBit=bitNumber(x);
            int yBit=bitNumber(y);
            if(xBit<yBit){
                return -1;
            }

            if(xBit>yBit){
                return 1;
            }

            if(x>y){
                return 1;
            }

            if(x<y){
                return -1;
            }
            return 0;
        });

        int[] result=new int[len];
        for (int i = 0; i < len; i++) {
            result[i]=ordered.get(i);
        }

        return result;
    }

    public static int bitNumber(int x){
        int result=0;
        while (x!=0){
            int i=x&1;
            result+=i;
            x=x>>1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
}
