package leetCode.Easy;

import java.util.Arrays;

public class EQ566ReshapeTheMatrixBetter {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length==0||mat.length*mat[0].length!=r*c)
            return mat;

        int[][] ans =new int[r][c];
        int idx=0;
        for(int[] row:mat){
            for(int n: row) {
              ans[idx/c][idx%c]=n;
              idx++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4}};
        int r=1, c=4;
        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
    }
}
