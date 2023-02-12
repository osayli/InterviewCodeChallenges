package leetCode.Medium;

import java.util.LinkedList;
import java.util.Queue;

/*
Given an n x n grid containing only values 0 and 1, where 0 represents water and 1 represents land,
 find a water cell such that its distance to the nearest land cell is maximized,
 and return the distance. If no land or water exists in the grid, return -1.

The distance used in this problem is the Manhattan distance: the distance between two cells (x0, y0)
 and (x1, y1) is |x0 - x1| + |y0 - y1|.



Example 1:


Input: grid = [[1,0,1],[0,0,0],[1,0,1]]
Output: 2
Explanation: The cell (1, 1) is as far as possible from all the land with distance 2.
Example 2:


Input: grid = [[1,0,0],[0,0,0],[0,0,0]]
Output: 4
Explanation: The cell (2, 2) is as far as possible from all the land with distance 4.
 */
public class MQ1162AsFarFromLandAsPossible {
    public static int maxDistance(int[][] grid) {
        if(grid==null||grid.length==0)
            return -1;
        int row=grid.length;
        int col=grid[0].length;
        boolean[][] visited=new boolean[row][col];
        return bfs(grid,visited,row,col);
    }
    public static int bfs(int[][] grid,boolean[][] visited,int row,int col){
        Queue<int[]> queue=new LinkedList<>();
        int[][] directions=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        int result=-1;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
               if(grid[i][j]==1){
                   visited[i][j]=true;
                   queue.offer(new int[]{i,j});
               }
            }
        }
      while ((!queue.isEmpty())){
          int size= queue.size();

          while ((size-->0)){
           int[] current=queue.poll();
           int x=current[0];
           int y=current[1];
           for(int[] dir:directions){
               int newX=dir[0]+x;
               int newY=dir[1]+y;
               if(newX<0||newY<0 ||newX>=row ||newY>=col || visited[newX][newY]){
                   continue;
               }
               visited[newX][newY]=true;
               grid[newX][newY]=grid[x][y]+1;
               result=Math.max(result,grid[newX][newY]);
               queue.offer(new int[]{newX,newY});
           }
          }
      }
      return result<0 ? -1:result-1;
    }

    public static void main(String[] args) {

    }
}
