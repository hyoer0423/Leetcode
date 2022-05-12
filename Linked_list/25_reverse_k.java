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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode pre=head;
        int num=0;
        if (pre==null) return pre;
        while(pre!=null && num<k){
            pre=pre.next;
            num++;      
        }
        if(num!=k)  return head;
        ListNode cur=head,post=head.next;
        pre=reverseKGroup(pre,k);
        while(num-- >0){
            post=cur.next;
            cur.next=pre;
            pre=cur;
            cur=post;
        }
       
        
    
    
    return pre;
    }
}