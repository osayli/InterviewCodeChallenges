package leetCode;

public class EQ69SqrtxBestPractice2 {
    public static  int mySqrt(int x){
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;
        return (int) r;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
    }

}
