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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=head.next,pre=head;
        while(cur!=null){
            if (cur.val<pre.val){
                pre.next=cur.next;
                cur.next=null;
                insert(dummy,cur);
            }
            pre=cur;
            cur=cur.next;
            
        }
        return dummy.next;
        
    }
    private void insert(ListNode dummy,ListNode ins){
        ListNode pre=dummy, cur=dummy.next;
        while(cur.val<ins.val){
            pre=cur;
            cur=cur.next;
        }
        
        pre.next=ins;
        ins.next=cur;
    }
}