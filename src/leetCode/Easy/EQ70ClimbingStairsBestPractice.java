package leetCode.Easy;

public class EQ70ClimbingStairsBestPractice {
    public static int climbStairs(int n) {
        int a = 1, b = 1;
        while (n-- > 0)
            a = (b += a) - a;
        return a;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
}
