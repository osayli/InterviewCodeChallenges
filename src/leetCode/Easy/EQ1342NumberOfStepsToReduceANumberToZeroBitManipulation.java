package leetCode.Easy;
/*
 // Notes:
    // & is AND Operation (1 AND 1 is 1, 1 AND 0 is 0, 0 AND 0 is 0)
    // num & 1 == 1 meaning odd, == 0 meaning even.
    // Example:
    // n = 15 or 1111. n & 0001 = 0001
    // n = 8 or 1000. n & 0001 = 0000.
    //
    // ^ is XOR Operation (1 OR 1 is 0, 1 OR 0 is 1, 0 OR 0 is 0)
    // num ^ 1 is num - 1 if num is odd, or num + 1 if num is even.
    // We only use num ^ 1 when num is odd.
    // Example:
    // n = 15 or 1111. n ^ 0001 = 1110 (14)
    // n = 8 or 1000. n ^ 0001 = 1001 (9)
    //
    // >> is SHIFT RIGHT Operation, the number is the number of bits moved
    (moving the whole binary one bit right).
    // num >> 1 is num / 2 if num is even. If num is odd, then is (num - 1) / 2.
    // Example:
    // n = 15 or 1111. n >> 1 = 0111 (7)
    // n = 8 or 1000. n >> 1 = 0100 (4)
 */
public class EQ1342NumberOfStepsToReduceANumberToZeroBitManipulation {
    public static int numberOfSteps(int num) {

        int count=0;
        while (num>0){
            num=(num&1)==1?num^1:num>>1;
            count++;
        }
       return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }
}

