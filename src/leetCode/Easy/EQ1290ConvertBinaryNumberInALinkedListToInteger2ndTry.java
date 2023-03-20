package leetCode.Easy;

public class EQ1290ConvertBinaryNumberInALinkedListToInteger2ndTry {

    public class ListNode{
        int val;
        ListNode next;

        ListNode(int val) {
            this.val=val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    int getDecimalValue(ListNode head) {
        int sum=0;
        while (head!=null){
         sum*=2;
         sum+=head.val;
         head=head.next;
        }

        return sum;
    }
}
