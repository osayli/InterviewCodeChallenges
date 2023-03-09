package leetCode.Easy;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:




Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]


Constraints:

0 <= rowIndex <= 33


Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
 */
public class EQ119PascalsTriangleII {
    public static List<Integer> getRow(int rowIndex) {

        List<Integer> row=new ArrayList<>();

        List<List<Integer>> rows=new ArrayList<>();
        row.add(1);
        if(rowIndex==0)
            return row;
        rows.add(row);
        row=new ArrayList<>();
        row.add(1);
        row.add(1);
        if(rowIndex==1)
            return row;
        rows.add(row);

        for (int i = 2; i <=rowIndex; i++) {
          List<Integer> previous=rows.get(i-1);
          row=new ArrayList<>();
          row.add(1);
            for (int j = 0; j < previous.size()-1; j++) {
                int sum=previous.get(j)+previous.get(j+1);
                row.add(sum);
            }
            row.add(1);
            rows.add(row);
        }
        return rows.get(row.size()-1);
    }

    public static void main(String[] args) {
        int rowIndex=3;
        System.out.println(getRow(rowIndex));
    }
}
