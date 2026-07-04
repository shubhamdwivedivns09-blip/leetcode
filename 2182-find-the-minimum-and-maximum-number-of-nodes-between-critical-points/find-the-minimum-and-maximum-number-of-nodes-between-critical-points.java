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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1,-1};
        int idx=1,fidx=-1,sidx=-1,lidx=-1, mindist = Integer.MAX_VALUE;
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode fwd = head.next.next;
        if(fwd==null) return ans;
        while(fwd!=null){
            if((curr.val<prev.val && curr.val<fwd.val) || curr.val>prev.val && curr.val>fwd.val){
                if(fidx==-1){
                    fidx=idx;
                }
                if(lidx!=-1){
                    int dist=idx-lidx;
                    mindist=Math.min(dist,mindist);
                }
                lidx=idx;
            }
            idx++;
            prev=prev.next;
            curr=curr.next;
            fwd=fwd.next;
        }
        int maxidx=lidx-fidx;
        if(fidx == lidx) return ans;
        ans[0] = mindist;
        ans[1] = maxidx;

        return ans;
    }
}