package HackerRank;

import java.util.Scanner;

/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

 A will consist at most 50 lower case english letters.
Sample Input

madam
Sample Output

Yes
 */
public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        StringBuffer sb=new StringBuffer(s).reverse();

        System.out.println(sb.toString().equals(s)? "Yes":"No");

    }
}
