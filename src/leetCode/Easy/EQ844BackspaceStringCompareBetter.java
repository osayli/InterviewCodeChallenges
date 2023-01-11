package leetCode.Easy;

public class EQ844BackspaceStringCompareBetter {
    public static boolean backspaceCompare(String s, String t) {
        while(s.contains("#")) {
            while(s.startsWith("#")) {
                s = s.substring(1);
            }
            s = s.replaceFirst(".#", "");
        }
        while(t.contains("#")) {
            while(t.startsWith("#")) {
                t = t.substring(1);
            }
            t = t.replaceFirst(".#", "");
        }

        System.out.println(s);
        System.out.println(t);
        return s.equals(t);
    }

    public static void main(String[] args) {
        String s="a##c";
        String t="#a#c";
        System.out.println(backspaceCompare(s,t));
    }
}
