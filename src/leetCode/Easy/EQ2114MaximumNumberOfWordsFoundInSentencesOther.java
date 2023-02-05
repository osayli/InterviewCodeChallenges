package leetCode.Easy;

public class EQ2114MaximumNumberOfWordsFoundInSentencesOther {
    public static int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0; i<sentences.length; i++) {
            max = Math.max(max,(sentences[i].split(" ")).length);
        }
        return max;
    }

    public static void main(String[] args) {
        String[] sentences={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}
