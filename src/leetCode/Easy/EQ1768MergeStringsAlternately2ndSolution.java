package leetCode.Easy;

public class EQ1768MergeStringsAlternately2ndSolution {
    public static String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        String[] ans=new String[2*Math.max(len1,len2)];
        for (int i = 0; i < len1; i++) {
            ans[2*i]=word1.substring(i,i+1);
        }
        for (int i = 0; i <len2; i++) {
            ans[2*i+1]=word2.substring(i,i+1);
        }
        StringBuilder merge= new StringBuilder();
        for(String s:ans){
            if(!(s ==null))
                merge.append(s);
        }
        return merge.toString();
    }

    public static void main(String[] args) {
        String word1="abcd";
        String word2="pq";
        System.out.println(mergeAlternately(word1,word2));
    }
}
