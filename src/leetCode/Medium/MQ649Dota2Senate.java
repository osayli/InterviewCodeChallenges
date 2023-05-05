package leetCode.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class MQ649Dota2Senate {
    public static String predictPartyVictory(String senate) {
        int len=senate.length();
        Queue<Integer> qR=new LinkedList<>();
        Queue<Integer> qD=new LinkedList<>();

        for (int i = 0; i < len; i++) {
            if(senate.charAt(i)=='R')
                qR.add(i);
            else
                qD.add(i);
        }

        while (!qR.isEmpty() && !qD.isEmpty()){
            int indexR=qR.remove();
            int indexD= qD.remove();

            if(indexR<indexD){
                qR.add(indexR+len);
            }else{
                qD.add(indexD+len);
            }
        }

        return qR.isEmpty() ? "Dire":"Radiant";
    }

    public static void main(String[] args) {
        String senate="DDRRR";
        System.out.println(predictPartyVictory(senate));
    }
}

