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
    public ListNode rev(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode f=curr.next;
            curr.next=prev;
            prev=curr;
            curr=f;
        }
        return prev;
    }
    public void merge(ListNode list1, ListNode list2) {

    while (list1 != null) {

        ListNode t1 = list1.next;
        ListNode t2 = list2.next;

        list2.next = list1;
        list1.next = t2;

        list2 = t2;
        list1 = t1;
    }
}
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode k = slow.next;
        slow.next=null;
        k=rev(k);
        merge(k,head);
        return;
    }
}