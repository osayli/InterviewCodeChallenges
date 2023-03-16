package leetCode.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class EQ496NextGreaterElementIWithMapAndStack {
    /*
    Key observation:
Suppose we have a decreasing sequence followed by a greater number
For example [5, 4, 3, 2, 1, 6] then the greater number 6 is the next greater element for all
 previous numbers in the sequence

We use a stack to keep a decreasing sub-sequence, whenever we see a number x greater than
stack.peek() we pop all elements less than x and for all the popped ones,
their next greater element is x
For example [9, 8, 7, 3, 2, 1, 6]
The stack will first contain [9, 8, 7, 3, 2, 1] and then we see 6 which is greater than 1
so we pop 1 2 3 whose next greater element should be 6
     */
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        for (int num:nums2){
            while (!stack.isEmpty()&&stack.peek()<num)
                map.put(stack.pop(),num);
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i]=map.getOrDefault(nums1[i],-1);
        }

        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}

