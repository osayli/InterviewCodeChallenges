package leetCode.Easy;

public class EQ067AddBinary2ndTry {

    public static String addBinary(String a, String b) {
        StringBuilder result=new StringBuilder();
        StringBuilder aa=new StringBuilder(a);
        StringBuilder bb=new StringBuilder(b);
        int lenA=a.length();
        int lenB=b.length();
        while (lenA!=lenB){
            if(lenA>lenB){
                bb.insert(0,"0");
                lenB++;
            }else{
                aa.insert(0,"0");
                lenA++;
            }
        }
        char[] ac=aa.toString().toCharArray();
        char[] bc=bb.toString().toCharArray();
        int carry=0;
        for (int i = lenA-1; i >=0; i--) {
           if(ac[i]=='1'&&bc[i]=='1'&& carry==1){
               result.insert(0,'1');
               carry=1;
           }else if(ac[i]=='1'&&bc[i]=='1'&& carry==0){
               result.insert(0,'0');
               carry=1;
            }else if((ac[i]=='1'||bc[i]=='1')&& carry==1){
               result.insert(0,'0');
               carry=1;
            }else{
           result.insert(0,Character.getNumericValue(ac[i])+Character.getNumericValue(bc[i])+carry);
           carry=0;
            }
        }
        if(carry==1){
            result.insert(0,'1');
        }
        return result.toString();
    }


    public static void main(String[] args) {
        String a="11";
        String b="1";
        System.out.println(addBinary(a,b));
    }
}
