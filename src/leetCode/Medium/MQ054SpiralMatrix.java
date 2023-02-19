package leetCode.Medium;

import java.util.ArrayList;
import java.util.List;

/*
Given an m x n matrix, return all elements of the matrix in spiral order.



Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]


Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
 */
public class MQ054SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral=new ArrayList<>();
        int left=0,right=matrix[0].length;
        int top=0,bottom=matrix.length;

        while(left<right &&top<bottom){
            //get every element in top row
            for (int i = left; i <right ; i++) {
              spiral.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <bottom ; i++) {
               spiral.add(matrix[i][right-1]);
            }
            right--;

            if(!(left<right &&top<bottom)){
                break;
            }
            for (int i = right-1; i >=left ; i--) {
                spiral.add(matrix[bottom-1][i]);
            }
            bottom--;

            for (int i = bottom-1; i >= top; i--) {
                spiral.add(matrix[i][left]);
            }
            left++;
        }
        return spiral;
    }

    public static void main(String[] args) {
     int[][] matrix={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        System.out.println(spiralOrder(matrix));
    }
}
