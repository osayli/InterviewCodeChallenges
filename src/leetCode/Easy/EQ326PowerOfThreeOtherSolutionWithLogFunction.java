package leetCode.Easy;

public class EQ326PowerOfThreeOtherSolutionWithLogFunction {
    public static boolean isPowerOfThree(int n) {
        if(n>0) {
            return Math.pow(3, (int) Math.round(Math.log(n) / Math.log(3))) == n;
        }else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(3));
    }
}
