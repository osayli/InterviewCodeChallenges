package leetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class EQ119PascalsTriangleII2ndSolution {

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> oldList=new ArrayList<>();
        oldList.add(1);
        List<Integer> newList=new ArrayList<>();
        newList.add(1);
        newList.add(1);
        if(rowIndex==0)
            return oldList;
        if(rowIndex==1)
            return newList;
        for (int i = 0; i < rowIndex+1; i++) {
            oldList=newList;
            newList=new ArrayList<>();
            newList.add(1);
            for (int j = 1; j <i ; j++) {
                newList.add(oldList.get(j-1)+oldList.get(j));
            }
            newList.add(1);
        }
        
    return newList;
        
    }

    public static void main(String[] args) {
        int rowIndex=3;
        System.out.println(getRow(rowIndex));
    }
}
