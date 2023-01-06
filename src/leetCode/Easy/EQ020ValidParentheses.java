package leetCode.Easy;

public class EQ020ValidParentheses {

    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
     */
    public static boolean isValid(String s) {

        if(s.length()%2!=0){
            return false;
        }else {
            while (s.length() > 2) {
                int min1 = s.contains(")") ? s.indexOf(')') : Integer.MAX_VALUE;
                int min2 = s.contains("]") ? s.indexOf(']') : Integer.MAX_VALUE;
                int min3 = s.contains("}") ? s.indexOf('}') : Integer.MAX_VALUE;
                int min = Integer.min(Integer.min(min1, min2), min3);
                if(min==0){
                    return false;
                }
                else if(s.substring(min-1,min+1).equals("()")||s.substring(min-1,min+1).equals("[]")||s.substring(min-1,min+1).equals("{}")) {
                    s = s.substring(0, min - 1) + s.substring(min + 1);
                }else{return false;}

            }
            return s.equals("()") || s.equals("[]") || s.equals("{}");
        }

    }

    public static void main(String[] args) {
        String test="()[]{}";
        System.out.println(isValid(test));
    }

}
