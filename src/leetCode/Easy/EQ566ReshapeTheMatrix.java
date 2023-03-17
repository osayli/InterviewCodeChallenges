package leetCode.Easy;

import java.util.Arrays;

/*
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one
 with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and
the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same
row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix;
 Otherwise, output the original matrix.



Example 1:


Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]
Example 2:


Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]


Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 100
-1000 <= mat[i][j] <= 1000
1 <= r, c <= 300
 */
public class EQ566ReshapeTheMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length==0||mat.length*mat[0].length!=r*c)
            return mat;
        int count=0;
        int[] arr =new int[Math.max(mat.length*mat[0].length,r*c)];
        int[][] ans =new int[r][c];
        int index=0;
        for(int[] m:mat){
            for(int i: m) {
                count++;
                arr[index]=i;
                index++;
            }
        }
        if(count!=r*c)
            return mat;

        int row=0;
        int col=0;
        for (int i = 0; i <arr.length; i++) {
            ans[row][col]=arr[i];
         col++;
        if(col==c) {
            row++;
            col=0;
        }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat={{1,2}};
        int r=1, c=1;
        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
    }
}
