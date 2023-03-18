package leetCode.Easy;

import java.util.ArrayList;
import java.util.List;

/*
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.



Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.


Constraints:

The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100
 */
public class EQ876MiddleOfTheLinkedList {

    static class ListNode{
        int val;
        ListNode next;

        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val, ListNode next){this.val=val;this.next=next;}

        public static void addAtTail(int val){
            ListNode curr=dummy;
            while(curr.next!=null)
                curr=curr.next;
            curr.next= new ListNode(val);
            ++length;
        }
    }
    public static ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }



    static int length=0;

    static ListNode dummy=new ListNode(0);

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.addAtTail(2);
        head.addAtTail(3);
        head.addAtTail(4);
        head.addAtTail(5);
        System.out.println(middleNode(head));
    }
}
