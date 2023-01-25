package leetCode.Medium;

public class MQ007ReverseIntegerOfficial {
/*
Solution
Approach 1: Pop and Push Digits & Check before Overflow
Intuition

We can build up the reverse integer one digit at a time. While doing so, we can check beforehand
whether appending another digit would cause overflow.

Algorithm

Reversing an integer can be done similarly to reversing a string.

We want to repeatedly "pop" the last digit off of xxx and "push" it to the back of the rev\text{rev}rev.
 In the end, rev\text{rev}rev will be the reverse of the xxx.

To "pop" and "push" digits without the help of some auxiliary stack/array, we can use math.

//pop operation:
pop = x % 10;
x /= 10;

//push operation:
temp = rev * 10 + pop;
rev = temp;
However, this approach is dangerous, because the statement temp=rev⋅10+pop\text{temp} = \text{rev} \cdot 10 +
\text{pop}temp=rev⋅10+pop can cause overflow.

Luckily, it is easy to check beforehand whether or this statement would cause an overflow.

To explain, lets assume that rev\text{rev}rev is positive.

If temp=rev⋅10+poptemp = \text{rev} \cdot 10 + \text{pop}temp=rev⋅10+pop causes overflow, then it must be that rev≥INTMAX10\text{rev} \geq \frac{INTMAX}{10}rev≥
10
INTMAX
​

If rev>INTMAX10\text{rev} > \frac{INTMAX}{10}rev>
10
INTMAX
​
 , then temp=rev⋅10+poptemp = \text{rev} \cdot 10 + \text{pop}temp=rev⋅10+pop is guaranteed to overflow.
If rev==INTMAX10\text{rev} == \frac{INTMAX}{10}rev==
10
INTMAX
​
 , then temp=rev⋅10+poptemp = \text{rev} \cdot 10 + \text{pop}temp=rev⋅10+pop will overflow if and only if pop>7\text{pop} > 7pop>7
Similar logic can be applied when rev\text{rev}rev is negative.


Complexity Analysis

Time Complexity: O(log⁡(x))O(\log(x))O(log(x)). There are roughly log⁡10(x)\log_{10}(x)log
10
​
 (x) digits in xxx.
Space Complexity: O(1)O(1)O(1).


 */
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;

    }

    public static void main(String[] args) {
        //System.out.println(Integer.MAX_VALUE);
        System.out.println(reverse(-21474836));
    }
}
