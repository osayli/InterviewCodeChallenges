package leetCode.Easy;

public class EQ191NumberOf1BitsBitManipulationII {
    public static int hammingWeight(int n) {
        int count= 0;
        int mask=1;
        for (int i = 0; i < 32; i++) {
            if((n&mask)!=0)
                count++;
            mask=mask<<1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n=21;
        System.out.println(hammingWeight(n));
    }
}
