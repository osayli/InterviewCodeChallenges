package leetCode.Easy;

public class EQ1779FindNearestPointThatHasTheSameXOrYCoordinateBetterSolution {
    public static int nearestValidPoint(int x, int y, int[][] points) {
        int idx=-1;
        int diff=Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            if(points[i][0]==x||points[i][1]==y){
                int distance=Math.abs(points[i][0]-x)+Math.abs(points[i][1]-y);
                    if(diff>distance){
                        diff=distance;
                        idx=i;
                    }
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[][] points={{1,2},{3,1},{2,4},{2,3},{4,4}};
        System.out.println(nearestValidPoint(3,4,points));
    }
}
