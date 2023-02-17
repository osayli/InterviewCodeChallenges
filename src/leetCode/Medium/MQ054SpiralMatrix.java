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

     int row=matrix.length, col=matrix[0].length;
     int capacity=row*col;
     int x=0,y=0;
     List<Integer> spiral=new ArrayList<>();
        for (int i = 0; i < capacity; i++) {

        }



     return spiral;

    }

    public static void main(String[] args) {
     int[][] matrix={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        System.out.println(spiralOrder(matrix));
    }
}
