public /**
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
   public void reorderList(ListNode head) {
       if (head==null ||head.next==null) return;
       ListNode slow=head, fast=head;
       while(fast!=null &&fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
    //    特别注意这边是对于slow.next
       ListNode head2=reverse(slow.next);
       slow.next=null;
       
       ListNode temp=new ListNode(0);
       temp.next=head;
       ListNode dummy=temp;
       
       ListNode head1=head;
      
       
       while(head1!=null &&head2!=null){
           dummy.next=head1;
           head1=head1.next;
           dummy=dummy.next;
           dummy.next=head2;
           head2=head2.next;
           dummy=dummy.next;
       }
       
       if( head1!=null){
           dummy.next=head1;
           
           
       }
       else{
           dummy.next=head2;
       }
      
   }
   private ListNode reverse(ListNode head){
       if (head==null) return head;
       ListNode pre=null, cur=head,post=head.next;
       while(cur!=null){
           
           post=cur.next;
           cur.next=pre;
           pre=cur;
           cur=post;
           
            
       }
       return pre;
       
   }
} 