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
    public ListNode swapPairs(ListNode head) {
        if(head==null ||head.next==null) return head;
        ListNode cur=head, post=head.next;
        while(cur!=null&& post!=null){
            int m=cur.val;
            cur.val=post.val;
            post.val=m;
            cur=post.next;
            if (cur==null) break;
            post=cur.next;
}
        return head;
        
    }
}
#use iteration
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null ||head.next==null) return head;
        ListNode post_head=swapPairs(head.next.next);
        head.next.next=head;
        ListNode new_head=head.next;
        head.next=post_head;
        return new_head;
    }
}