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
        ListNode curr = head;
        while(curr!=null){
            ListNode first=curr.next;
            curr.next=prev;
            prev=curr;
            curr=first;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        ListNode a = head;
        ListNode b = head;

        for(int i=0;i<left-1;i++){
            a=a.next;
        }
        for(int i=0;i<right-1;i++){
            b=b.next;
        }
        for(int i=0;i<left-2;i++){
            temp=temp.next;
        }
        
        
        ListNode temp2=b.next;
        b.next=null;
        ListNode newHead = rev(a);
        temp.next=newHead;
        a.next=temp2;


        if (left == 1) {
        head = newHead;
        } else {
            temp.next = newHead;
        }
        a.next = temp2;

        
        return head;
    }
}