package leetCode.Easy;
/*
Approach
This code implements a solution to interpret a given string command. The approach is as follows:

Create a StringBuilder object "sb" to store the final interpreted string.
Loop through each character in the given command string.
If the current character is 'G', append it to the string builder.
If the current character is '(' and the next character is ')', append "o" to the string builder.
If the current character is '(' and the next character is 'a', append "al" to the string builder.
After the loop, return the string in the string builder.
Complexity
Time complexity:
The time complexity of this code is O(n), where n is the length of the input string "command".
This is because the code performs a single loop through the input string and the amount of work
 performed in each iteration is constant, regardless of the size of the input.

Space complexity:
The space complexity of this code is O(n), where n is the length of the interpreted string.
This is because a StringBuilder object is used to store the interpreted string,
and its size will grow proportionally to the size of the interpreted string.
In the worst case scenario, where every character in the input string is interpreted,
the space complexity would be O(n), where n is the length of the input string.
 */
public class EQ1678GoalParserInterpretationStringBuilder {
    public static String interpret(String command) {
       StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i)=='G'){
                sb.append("G");
            }
            if(command.charAt(i)=='(' &&command.charAt(i+1)==')'){
               sb.append("o");
            }
            if(command.charAt(i)=='(' &&command.charAt(i+1)=='a'){
                sb.append("al");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String command="(al)G(al)()()G";
        System.out.println(interpret(command));
    }
}
