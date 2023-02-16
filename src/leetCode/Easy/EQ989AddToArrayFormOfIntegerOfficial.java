package leetCode.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Approach 1: Schoolbook Addition
Intuition

Let's add numbers in a schoolbook way, column by column. For example, to add 123 and 912,
we add 3+2, then 2+1, then 1+9. Whenever our addition result is more than 10,
we carry the 1 into the next column. The result is 1035.

Algorithm

We can do a variant of the above idea that is easier to implement -
we put the entire addend in the first column from the right.

Continuing the example of 123 + 912, we start with [1, 2, 3+912].
Then we perform the addition 3+912, leaving 915. The 5 stays as the digit,
while we 'carry' 910 into the next column which becomes 91.

We repeat this process with [1, 2+91, 5]. We have 93, where 3 stays
and 90 is carried over as 9. Again, we have [1+9, 3, 5] which transforms into [1, 0, 3, 5].
 */
public class EQ989AddToArrayFormOfIntegerOfficial {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans=new ArrayList<>();
        int lenN=num.length;

        while(--lenN>=0||k>0){
            if(lenN>=0)
                k+=num[lenN];
            ans.add(k%10);
            k/=10;
        }

        Collections.reverse(ans);
        return ans;

    }

    public static void main(String[] args) {

        int[] num={1,2,0,0};
        int k=34;
        System.out.println(addToArrayForm(num,k));
    }
}

