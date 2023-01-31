package HackerRank;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

/*
Given a double-precision number, payment, denoting an amount of money,
use the NumberFormat class' getCurrencyInstance method to convert  into the US,
 Indian, Chinese, and French currency formats. Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where  farmatted Payment is payment formatted according to the appropriate Locale's currency.

Note: India does not have a built-in Locale, so you must construct
one where the language is en (i.e., English).

Input Format

A single double-precision number denoting payment .

Constraints
0<=payment<=10^9
Output Format

On the first line, print US: u where u  is payment formatted for US currency.
On the second line, print India: i where i is payment formatted for Indian currency.
On the third line, print China: c where  c is payment  formatted for Chinese currency.
On the fourth line, print France: f, where f is payment formatted for French currency.

Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
Explanation

Each line contains the value of payment formatted according to
 the four countries' respective currencies.
 */
public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double payment=scanner.nextDouble();
        scanner.close();
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String us = n.format(payment);
        Locale IND=new Locale("en_IN");
        NumberFormat n1 = NumberFormat.getCurrencyInstance(IND);
        String india = n1.format(payment);
        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = n2.format(payment);
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = n3.format(payment);

        // Write your code here.

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}
