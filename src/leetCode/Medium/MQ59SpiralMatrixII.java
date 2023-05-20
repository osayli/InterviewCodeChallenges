package leetCode.Medium;

import java.util.Arrays;

/*
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.



Example 1:


Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]
Example 2:

Input: n = 1
Output: [[1]]


Constraints:

1 <= n <= 20
 */
public class MQ59SpiralMatrixII {

    public static int[][] generateMatrix(int n) {
        int[][] spiral=new int[n][n];
        int left=0,right=n-1;
        int top=0,bottom=n-1;

        spiral[0][0]=1;
        while(left<=right &&top<=bottom){
            //get every element in top row
            for (int i = left; i <=right ; i++) {
                if(i==0&& left==0)
                    spiral[top][i]=1;
                else
                    spiral[top][i]=spiral[top][i-1]+1;
            }
            top++;
            for (int i = top; i <=bottom ; i++) {
                spiral[i][right]=spiral[i-1][right]+1;
            }
            right--;

            if(!(left<=right &&top<=bottom)){
                break;
            }
            for (int i = right; i >=left ; i--) {
                spiral[bottom][i]=spiral[bottom][i+1]+1;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                spiral[i][left]=spiral[i+1][left]+1;
            }
            left++;

        }

        return spiral;
    }

    public static void main(String[] args) {
        int n=2;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }
}
