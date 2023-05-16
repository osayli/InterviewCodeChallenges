package leetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class MQ120TriangleOther {
    public static int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size()-2; i >=0 ; i--) {
            for (int j = 0; j <=i ; j++) {
              triangle.get(i).set(j,triangle.get(i).get(j)+
                      Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }

    public static void main(String[] args) {

        List<Integer> one=new ArrayList<>();
        one.add(2);

        List<Integer> two=new ArrayList<>();
        two.add(3);
        two.add(4);
        List<Integer> three=new ArrayList<>();
        three.add(6);
        three.add(5);
        three.add(7);

        List<Integer> four=new ArrayList<>();
        four.add(4);
        four.add(1);
        four.add(8);
        four.add(3);
        List<List<Integer>> triangle=new ArrayList<>();
        triangle.add(one);
        triangle.add(two);
        triangle.add(three);
        triangle.add(four);
        System.out.println(triangle);
        System.out.println(minimumTotal(triangle));

    }
}
