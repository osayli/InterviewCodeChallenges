package leetCode.Easy;

import java.util.Arrays;
import java.util.HashSet;

public class EQ1346CheckIfNAndItsDoubleExistBinarySearch {
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
           int target=2*arr[i];
           int left=0,right=arr.length-1;
           while(left<=right){
               int mid=left+(right-left)/2;
               if(arr[mid]==target&&mid!=i)
                   return true;
               if(arr[mid]<target)
                   left=mid+1;
               else
                   right=mid-1;
           }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={4,-7,11,4,18};
        System.out.println(checkIfExist(arr));
    }
}
