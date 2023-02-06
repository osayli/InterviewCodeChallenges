package HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Two strings a,  and b, are called anagrams if they contain all the same characters
 in the same frequencies. For this challenge, the test is not case-sensitive.
 For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  a and b  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case-sensitive.
Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	                     3	      3
G or g	                     1	      1
N or n	                     1	      1
M or m	                     1	      1
R or r	                     1	      1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
Explanation 1

Character	Frequency: anagramm	Frequency: marganaa
A or a	3	4
G or g	1	1
N or n	1	1
M or m	2	1
R or r	1	1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello
Sample Output 2

Anagrams
Explanation 2

Character	Frequency: Hello	Frequency: hello
E or e	1	1
H or h	1	1
L or l	2	2
O or o	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
 */
public class JavaAnagrams {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String str1=scanner.nextLine().toLowerCase();
        scanner.nextLine();
        String str2=scanner.nextLine().toLowerCase();
        Map<Character,Integer> m1=new HashMap<>();
        Map<Character,Integer> m2=new HashMap<>();
        for(char c:str1.toCharArray()){
            if(!m1.containsKey(c)){
                m1.put(c,1);
            }else{
                m1.put(c,m1.get(c)+1);
            }
        }

        for(char c:str2.toCharArray()){
            if(!m2.containsKey(c)){
                m2.put(c,1);
            }else{
                m2.put(c,m2.get(c)+1);
            }
        }
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1.equals(m2)?"Anagrams":"Not Anagrams");

    }



}