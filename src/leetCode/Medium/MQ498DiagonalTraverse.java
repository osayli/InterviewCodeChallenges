package leetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.



Example 1:


Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,4,7,5,3,6,8,9]
Example 2:

Input: mat = [[1,2],[3,4]]
Output: [1,2,3,4]


Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 104
1 <= m * n <= 104
-105 <= mat[i][j] <= 105
 */
public class MQ498DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] mat) {
        int row=mat.length,col=mat[0].length;
        int y=0,x=0;
        int[] arr=new int[row*col];
        int index=0;

        while (index<arr.length){
           arr[index++]=mat[y][x];
           int sum =y+x;
           boolean isEven=sum%2==0;
           if(isEven){
              if(x<col-1&&y>0){
                 x++;
                 y--;
              }else if (x<col-1){
                  x++;
              }else{
                  y++;
              }
           }else{
             if(y<row-1 &&x>0){
                 x--;
                 y++;
             }else if(y<row-1){
                 y++;
             }else{
                 x++;
             }
           }
        }

        return arr;
    }

    public static void main(String[] args) {
 int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(findDiagonalOrder(mat)));
    }
}
