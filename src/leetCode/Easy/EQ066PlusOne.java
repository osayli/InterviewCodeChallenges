package leetCode.Easy;

import java.util.Arrays;

public class EQ066PlusOne {
    public static int[] plusOne(int[] digits) {
        int carryOver=0;
        int[] result;
        int length=digits.length;
        int sum=0;
        for(int i:digits){
            sum+=i;
        }
        if(sum==9* digits.length){
          result=new int[length+1];
          result[0]=1;
            for (int i = result.length-1; i > 0; i--) {
                if(i==result.length-1){
                    result[i]=digits[i-1]+1;
                }else{
                    result[i]=digits[i-1];
                }
                if(carryOver==1){
                    result[i]=digits[i]+1;
                    carryOver--;
                }
                    if(result[i]==10){
                        result[i]=0;
                        carryOver++;
                    }

        }
        }else{
            result=new int[length];
                for (int i = length-1; i >= 0; i--) {
                    if(i==length-1){
                        result[i]=digits[i]+1;
                    }else{
                        result[i]=digits[i];
                    }
                    if(carryOver==1){
                        result[i]=digits[i]+1;
                        carryOver--;
                    }
                        if(result[i]==10){
                            result[i]=0;
                            carryOver++;

                    }

                }
        }

    return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9})));
    }
}
