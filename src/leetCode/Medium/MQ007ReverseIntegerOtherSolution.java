package leetCode.Medium;

public class MQ007ReverseIntegerOtherSolution {
    public static int reverse(int x) {
        try {
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();

            return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }

    }

    public static void main(String[] args) {
        //System.out.println(Integer.MAX_VALUE);
        System.out.println(reverse(Integer.MIN_VALUE));
        System.out.printf("merhaba");
    }
}
