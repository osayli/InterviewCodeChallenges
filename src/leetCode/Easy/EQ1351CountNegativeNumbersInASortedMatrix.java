package leetCode.Easy;
/*
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.



Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0


Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 100
-100 <= grid[i][j] <= 100
 */
public class EQ1351CountNegativeNumbersInASortedMatrix {
    public static int countNegatives(int[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int[] i:grid){
            if(i[0]<0){
                count+=m;
                continue;
            }

            if(i[m-1]<0) {
                int l=0, r=m;
                while(l<r){
                    int mid=l+(r-l)/2;
                    if(i[mid]>=0)
                        l=mid+1;
                    else
                        r=mid;
            }
                count+=m-l;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
}
