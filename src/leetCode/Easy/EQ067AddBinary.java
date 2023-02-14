package leetCode.Easy;
/*
Given two binary strings a and b, return their sum as a binary string.



Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"


Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */
public class EQ067AddBinary {

    public static String addBinary(String a, String b) {
        String result = "";
        int lenA = a.length();
        int lenB = b.length();
        while (lenA > lenB) {
            b = "0" + b;
            lenB++;
        }
        while (lenB > lenA) {
            a = "0" + a;
            lenA++;
        }
        String[] aa=a.split("");
        String[] bb=b.split("");
        int plus=0;
        for (int i = lenA-1; i >=0; i--) {
          if(aa[i].equals("1")&&bb[i].equals("1")&&plus==1){
              result="1"+result;
              plus=1;
          }
          else if(aa[i].equals("1")&&bb[i].equals("1")&&plus==0){
              result="0"+result;
              plus=1;

          }
          else if((aa[i].equals("1")||bb[i].equals("1"))&&(plus==1)){
              result="0"+result;
              plus=1;

          }else{
              result=Integer.parseInt(aa[i])+Integer.parseInt(bb[i])+plus+result;
              plus=0;
          }

        }
        if(plus==1){
            result=plus+result;
        }
        return result;
    }


    public static void main(String[] args) {
       String a="1010";
       String b="1011";
        System.out.println(addBinary(a,b));
    }
}
