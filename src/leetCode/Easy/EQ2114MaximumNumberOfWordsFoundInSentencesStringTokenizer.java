package leetCode.Easy;

import java.util.StringTokenizer;

public class EQ2114MaximumNumberOfWordsFoundInSentencesStringTokenizer {
    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s :sentences)
            max = Math.max(max, new StringTokenizer(s).countTokens());

        return max;
    }

    public static void main(String[] args) {
        String[] sentences={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}
