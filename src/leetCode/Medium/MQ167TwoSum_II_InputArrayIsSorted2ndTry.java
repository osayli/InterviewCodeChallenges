package leetCode.Medium;

import java.util.Arrays;

public class MQ167TwoSum_II_InputArrayIsSorted2ndTry {
    public static int[] twoSum(int[] numbers, int target) {
        int right=numbers.length-1,left=0;
       while(left<right){
           int sum=numbers[right]+numbers[left];
           if(sum>target){
               left--;
           }else if(sum<target){
               right++;
           }else{
               return new int[]{left+1,right+1};
           }

       }
       return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] numbers = {-1,0};
        int target=-1;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
}

