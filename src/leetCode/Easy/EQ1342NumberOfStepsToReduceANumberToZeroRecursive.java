package leetCode.Easy;
/*

 */
public class EQ1342NumberOfStepsToReduceANumberToZeroRecursive {
    public static int numberOfSteps(int num) {

      return count(num,0);

    }
    public static int count(int num, int steps){
        if(num==0){
            return steps;
        }
        if((num&1)==0){
            return count(num/2,steps+1);
        }
        return count(num-1,steps+1);
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
