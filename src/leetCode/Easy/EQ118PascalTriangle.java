package leetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class EQ118PascalTriangle {
    /*
    Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:




Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]

     */

    public static List<List<Integer>> generate(int numRows) {
        List<Integer> row=new ArrayList<>();
        List<List<Integer>> rows=new ArrayList<>();

        row.add(1);
        rows.add(row);
        if(numRows==1)
            return  rows;
        row=new ArrayList<>();
        row.add(1);
        row.add(1);
        rows.add(row);
        if(numRows==2)
            return rows;
        for (int i = 2; i < numRows; i++) {
          row=new ArrayList<>();
          List<Integer> previous=rows.get(i-1);
          row.add(1);
            for (int j = 0; j < previous.size()-1; j++) {

                int sum=previous.get(j)+previous.get(j+1);
                row.add(sum);
            }
            row.add(1);
            rows.add(row);
        }
        return rows;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
