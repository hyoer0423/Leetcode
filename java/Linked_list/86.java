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
    public ListNode partition(ListNode head, int x) {
        ListNode l=new ListNode(0);
        ListNode s=new ListNode(0);
        ListNode p1=l;
        ListNode p2=s;
        while(head!=null){
            if (head.val<x){
                p2.next=head;
                p2=p2.next;
            }
            else{
                p1.next=head;
                p1=p1.next;
            }
            head=head.next;
        }
        p1.next=null;
        p2.next=l.next;
        return s.next;
    }
}