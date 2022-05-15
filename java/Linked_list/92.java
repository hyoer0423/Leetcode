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
    public ListNode reverseBetween(ListNode head, int left, int right) {
         if (head==null||head.next==null||left==right) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode start_swap=head;
        ListNode before_swap=dummy;
        before_swap.next=head;
        int inter=right-left;
        int inter1=right-left;
        while(left>1){
            left--;
            before_swap=start_swap;
            start_swap=start_swap.next;
              
        }
        before_swap.next=null;
        ListNode after_pre=dummy;
        ListNode after_swap=start_swap.next;
        while(inter>0){
            inter--;
            after_pre=after_swap;
            after_swap=after_swap.next;
        }
        after_pre.next=null;
        // ListNode temp=reversed(start_swap);
       ListNode temp=null;
       
        while(inter1>-1){
            temp=start_swap.next;
            
            start_swap.next=after_swap;
            after_swap=start_swap;
            start_swap=temp;
            inter1--;
        }
        
       
        before_swap.next=after_swap;
        
        return dummy.next;
        
        
    }
    private ListNode reversed(ListNode head){
        ListNode pre=null,cur=head,post=cur.next;
        while(cur!=null){
            post=cur.next;
            cur.next=pre;
            pre=cur;
            cur=post;
            
            
        }
        return pre;
    }
    
}public class 92 {
    
}
