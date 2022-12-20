package leetCode;

public class EQ69Sqrtx{
    public static int mySqrt(int x) {
        int result=(int) Math.sqrt(Integer.MAX_VALUE);
        for (int i =0; i <Math.sqrt(Integer.MAX_VALUE) ; i++) {
            if(i*i>x) {
                result = i;
                break;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
    }
}
