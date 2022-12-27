package leetCode;

import java.util.Arrays;

public class EQ136SingleNumberBestPractice {

    public static int singleNumber(int[] nums) {
        return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
    }

    public static void main(String[] args) {
        int[] nums={1,4,1,2,3,2,3};
        System.out.println(singleNumber(nums));
        System.out.println(1^4^1^2^3^2^3);
    }
}
