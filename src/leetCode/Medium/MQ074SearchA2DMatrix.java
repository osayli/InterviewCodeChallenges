package leetCode.Medium;
/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.



Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false


Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
 */
public class MQ074SearchA2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int left=0,right=matrix.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(matrix[mid][0]>target)
                right=mid;
            else{
                left=mid+1;
                int l=0,r=matrix[mid].length-1;
                while(l<=r){
                    int i=l+(r-l)/2;
                    if(matrix[mid][i]>target)
                        r=i-1;
                    else if(matrix[mid][i]<target)
                        l=i+1;
                    else
                        return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=67;
        System.out.println(searchMatrix(matrix,target));
    }
}
