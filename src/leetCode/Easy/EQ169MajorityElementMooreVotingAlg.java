package leetCode.Easy;

public class EQ169MajorityElementMooreVotingAlg {
    public static int majorityElement(int[] nums) {

        int count=0, ret=0;

        for(int num:nums){
            if(count==0)
                ret=num;

            if(num!=ret)
                count--;
            else
                count++;
        }
        return ret;

    }

    public static void main(String[] args) {

        int[] nums={3,3,4};
        System.out.println(majorityElement(nums));
    }
}
