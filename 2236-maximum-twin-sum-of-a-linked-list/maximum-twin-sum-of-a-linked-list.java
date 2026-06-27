
class Solution {
    public ListNode rev(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode first=curr.next;
            curr.next=prev;
            prev=curr;
            curr=first;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode k = slow.next;
        slow.next=null;
        ListNode r = rev(k);
        ListNode i=head;
        ListNode j=r;
        int max=0;
        while(i!=null){
            if(i.val+j.val>max){
                max=i.val+j.val;
            }
            i=i.next;
            j=j.next;
        }
        return max;
    }
}