package leetCode.Hard;

import java.util.*;

/*
Given an array of integers arr, you are initially positioned at the first index of the array.

In one step you can jump from index i to index:

i + 1 where: i + 1 < arr.length.
i - 1 where: i - 1 >= 0.
j where: arr[i] == arr[j] and i != j.
Return the minimum number of steps to reach the last index of the array.

Notice that you can not jump outside the array at any time.



Example 1:

Input: arr = [100,-23,-23,404,100,23,23,23,3,404]
Output: 3
Explanation: You need three jumps from index 0 --> 4 --> 3 --> 9. Note that index 9 is the last index of the array.
Example 2:

Input: arr = [7]
Output: 0
Explanation: Start index is the last index. You do not need to jump.
Example 3:

Input: arr = [7,6,9,6,9,6,9,7]
Output: 1
Explanation: You can jump directly from index 0 to index 7 which is last index of the array.


Constraints:

1 <= arr.length <= 5 * 104
-108 <= arr[i] <= 108
 */
public class HQ1345JumpGameIV {
    public static int minJumps(int[] arr) {
        int length=arr.length;
        int jump=0;
        if(length==1){
            return jump;
        }
        Map<Integer, List<Integer>> map=new HashMap<>();
        for (int i = 0; i < length; i++) {
         map.computeIfAbsent(arr[i],v-> new ArrayList<>()).add(i);
        }
            Queue<Integer> q=new LinkedList<>();
            q.offer(0);
            while (!q.isEmpty()){
               jump++;
               int size=q.size();
                for (int i = 0; i < size; i++) {
                  int j= q.poll();

                  if(j-1>0&&map.containsKey(arr[j-1])){
                      q.offer(j-1);
                  }
                    if(j+1<length&&map.containsKey(arr[j+1])){
                       if(j+1==length-1){
                           return jump;
                       }
                       q.offer(j+1);
                    }

                    if(map.containsKey(arr[j])){
                        for(int k: map.get(arr[j])){
                          if(k!=j){
                            if(k==length-1) return jump;
                            q.offer(k);
                          }
                        }
                    }
                    map.remove(arr[j]);
                }

        }

        return jump;
    }

    public static void main(String[] args) {
        int[] arr={100,-23,-23,404,100,23,23,23,3,404};
        System.out.println(minJumps(arr));
    }
}
