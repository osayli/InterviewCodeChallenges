package leetCode.Easy;

import static java.lang.Math.*;

public class EQ326PowerOfThreeOtherSolution {
    public static boolean isPowerOfThree(int n) {
        double a = log(n) / log(3);
//        System.out.println(rint(a));
//        System.out.println(a);
        return abs(a - rint(a)) <= 0.00000000000001;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(4));
    }
}
