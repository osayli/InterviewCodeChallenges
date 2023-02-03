package leetCode.Medium;

/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"


Constraints:

1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000
 */
public class MQ006ZigzagConversion {
    public static String convert(String s, int numRows) {
        if(s.length()<=numRows||numRows==1)
            return s;

        StringBuilder[] sbs=new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
          sbs[i]=new StringBuilder();
        }

        char[] arr=s.toCharArray();
        int n=arr.length;
        int index=0;

        while(index<n){
            for (int i = 0; i < numRows&&index<n; i++) {
                sbs[i].append(arr[index++]);
            }

            for (int i = numRows-2; i >0&& index<n ; i--) {
                 sbs[i].append(arr[index++]);
            }
        }
        StringBuilder result=sbs[0];
        for (int i = 1; i <numRows ; i++) {
            result.append(sbs[i].toString());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        int numRows=3;
        System.out.println(convert(s,numRows));
    }
}
