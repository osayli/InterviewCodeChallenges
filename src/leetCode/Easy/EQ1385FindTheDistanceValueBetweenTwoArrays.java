package leetCode.Easy;

public class EQ1385FindTheDistanceValueBetweenTwoArrays {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for (int k : arr1) {
            boolean flag=true;
            for (int i : arr2) {
                if (Math.abs(k - i) <= d){
                    flag = false;
                break;
            }
            }
            if (flag)
                count++;

        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1={1,4,2,3};
        int[] arr2={-4,-3,6,10,20,30};
        int d=3;
        System.out.println(findTheDistanceValue(arr1,arr2,d));
    }
}
