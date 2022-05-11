# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def partition(self, head, x):
        """
        :type head: ListNode
        :type x: int
        :rtype: ListNode
        """
        dumSmall,dumGreat=ListNode(-1),ListNode(-1)
        smaller,greater= dumSmall,dumGreat
        while head!=None:
            if head.val<x:
                smaller.next=head
                smaller=smaller.next
                
            else:
                greater.next=head
                greater=greater.next
            head=head.next
        smaller.next=dumGreat.next
        greater.next=None
        return dumSmall.next
        
        
        