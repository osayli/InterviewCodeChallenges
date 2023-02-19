package leetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class EQ118PascalTriangle2ndAttempt {
    public static List<List<Integer>> generate(int numRows) {
       List<List<Integer>> pascal=new ArrayList<>();
       List<Integer> row=new ArrayList<>();
       row.add(1);
       pascal.add(row);
       if(numRows==1)
           return pascal;
        row=new ArrayList<>();
        row.add(1);
        row.add(1);
        pascal.add(row);
        if(numRows==2)
            return pascal;
        for(int j=2;j<numRows;j++){
            row=new ArrayList<>();
            List<Integer> previous=pascal.get(j-1);
            row.add(1);
            for (int i = 0; i <previous.size()-1 ; i++) {
                int sum=previous.get(i)+previous.get(i+1);
                row.add(sum);
            }
            row.add(1);
            pascal.add(row);
        }
        return pascal;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
