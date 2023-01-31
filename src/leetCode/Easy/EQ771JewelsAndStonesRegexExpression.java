package leetCode.Easy;

public class EQ771JewelsAndStonesRegexExpression {
    /*
    replaceAll(String regex, String replacement) is a method of String objects that replaces any
     parts of the string that matches the provided regular expression (regex) with a replacement.
     In regex, "[ ]" matches characters that in the bracket; e.g. "[abc]" matches
     any "a", "b", or "c". "[^ ]" matches characters not in the bracket; e.g. "[^ab]" will
     match "c" in String "abc". String J was concatenated to "[^" and "]" to create
     the regex "[^ (all characters in J) ]" in order to replace any characters of S that is not
      in J with a blank "".
     */
    public static int numJewelsInStones(String jewels, String stones) {
        return stones.replaceAll("[^" + jewels + "]", "").length();
    }

    public static void main(String[] args) {
        String jewels="Aa";
        String stones="aaAbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
}
