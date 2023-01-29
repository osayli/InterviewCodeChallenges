package HackerRank;

import java.util.Scanner;

public class JavaDataTypes {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        for(int j=0;j<t;j++){
            try{
                long n=scanner.nextLong();
                System.out.println(n+" can be fitted in:");
                if (n <= Byte.MAX_VALUE && n >=Byte.MIN_VALUE) {
                    System.out.println("* byte");
                }
                if (n <= Short.MAX_VALUE && n >=Short.MIN_VALUE) {
                    System.out.println("* short");
                }

                if (n <= Integer.MAX_VALUE && n >=Integer.MIN_VALUE) {
                    System.out.println("* int");
                }

                System.out.println("* long");
            }catch(Exception e){
                String s=scanner.next();
                System.out.println(s+" can't be fitted anywhere.");
            }



        }
    }
}
