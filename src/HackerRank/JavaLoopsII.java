package HackerRank;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        for(int j=0;j<2;j++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int n=scanner.nextInt();
            System.out.println(a+" "+b+" "+n);
            int sum=a;
            for(int i=0;i<n;i++){
                sum+=(Math.pow(2,i))*b;
                System.out.print(sum+" ");
            }
            System.out.println();

        }
    }
}
//2 6 14 30 62 126 254 510 1022 2046