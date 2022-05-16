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
   public ListNode insertionSortList(ListNode head) {
       if (head==null) return head;
       ListNode dummy=new ListNode(0);
       
       ListNode temp=head;
       // ListNode pre=dummy;
       while(temp!=null){
           //特别注意这边slow是dummy 因为dummy之后是null 防止进入死循环
           ListNode slow=dummy;
           
           while((slow.next!=null)&&(slow.next.val<temp.val)){
              
                   slow=slow.next;
               }
           ListNode next=temp.next;
           temp.next=slow.next;
           slow.next=temp;   
           temp=next;
           }
           
          return dummy.next;
           

           
       }
       
   
       
       
   
} 