package leetCode.Easy;

import java.util.HashSet;
import java.util.Set;

public class EQ771JewelsAndStonesUsingSet {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> hs = new HashSet<Character>();
        for(char ch : jewels.toCharArray()){
            hs.add(ch);
        }
        for(char ch : stones.toCharArray()){
            if(hs.contains(ch)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels="Aa";
        String stones="aaAbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
}
