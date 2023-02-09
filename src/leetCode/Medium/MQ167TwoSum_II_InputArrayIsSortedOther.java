package leetCode.Medium;

import java.util.Arrays;

public class MQ167TwoSum_II_InputArrayIsSortedOther {
    public static int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int sum=0;
        while (left<right){
            sum=numbers[left]+numbers[right];
            if(sum==target) return new int[]{left + 1, right + 1};
            if(sum<target) left++;
            else right--;
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] numbers = {5,25,75};
        int target=100;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
}
