package leetCode.Medium;

import java.util.Arrays;

public class MQ443StringCompression {
    public static int compress(char[] chars) {
        int index=0;
        for (int i = 0; i < chars.length;) {
           char letter=chars[i];
           int count=0;
           while(i<chars.length && chars[i]==letter){
               count++;
               i++;
            }
           chars[index++]=letter;
           if(count>1){
              for(char c:String.valueOf(count).toCharArray()){
                  chars[index++]=c;
              }
           }
        }
        return index;
        }

    public static void main(String[] args) {
        char[] chars={'a','b','c'};
        System.out.println(compress(chars));
    }
}

