package leetCode;

public class EQ69SqrtxBestPractice1 {

    public static  int mySqrt(int x){
        long half=x/2;
        while(half*half>x)
            half/=2;
        while (half*half<=x){
            half++;}
            return (int)--half;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
    }
}
