public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null ||head.next==null){
            return null;
        }
        ListNode slow=head, fast=head;
        while(fast!=null &&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (slow==fast) break;
        }
        if (slow!=fast){
            return null;
        }
        ListNode temp=head;
        
        while(temp!=slow){
            slow=slow.next;
            temp=temp.next;
                
        }
        return temp;
        
        
    }
}