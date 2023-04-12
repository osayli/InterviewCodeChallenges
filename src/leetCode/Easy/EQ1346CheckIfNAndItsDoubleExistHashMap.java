package leetCode.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EQ1346CheckIfNAndItsDoubleExistHashMap {
    public static boolean checkIfExist(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        int len=arr.length;
        for (int i = 0; i < len; i++) {
            map.put(arr[i],i);
        }

        for (int i = 0; i < len; i++) {
           if(map.containsKey(2*arr[i]) && map.get(2*arr[i])!=i)
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr={4,-7,11,4,18};
        System.out.println(checkIfExist(arr));
    }
}
