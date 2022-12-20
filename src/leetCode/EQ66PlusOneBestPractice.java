package leetCode;

import java.util.Arrays;

public class EQ66PlusOneBestPractice {

    public  static int[] plusOne(int[] digits){
        int n=digits.length;
        for (int i =n-1; i >+0 ; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newNumber=new int[n+1];
        newNumber[0]=1;
        return newNumber;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9})));
    }
}
