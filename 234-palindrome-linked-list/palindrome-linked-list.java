// class Solution {
//      public ListNode reverse(ListNode head) {
//         if(head==null) return null;
//         ListNode p=null;
//         ListNode c=head;
//         while(c!=null){
//             ListNode f = c.next;
//             c.next=p;
//             p=c;
//             c=f;
//         }
//         return p;
//     }
//     public boolean isPalindrome(ListNode head) {
//         if(head.next==null) return true;
//         ListNode slow = head;
//         ListNode fast = head;
//         while(fast.next!=null && fast.next.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }     
//         ListNode head2=slow.next;
//         slow.next=null;
//         head2=reverse(head2);
//         ListNode i=head;
//         ListNode j=head2;
//         while(j!=null){
//             if(i.val!=j.val){
//                 return false;
//             }
//             i=i.next;
//             j=j.next;
//         }
//         return true;

//     }
// }

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        // Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            if (first.val != second.val)
                return false;

            first = first.next;
            second = second.next;
        }

        return true;
    }
}