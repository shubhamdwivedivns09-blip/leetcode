/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode t1=dummy1;
        ListNode t2=dummy2;
        ListNode temp=head;
        int pos = 1;
        while(temp!=null){
            if(pos%2!=0){
                t1.next=temp; 
                t1=temp; 
                temp=temp.next;
            }
            else{
                t2.next=temp;
                t2=temp;
                temp=temp.next;
            }
            pos++;
        }
        t1.next=dummy2.next;
        t2.next=null;
        return dummy1.next;
    }
}