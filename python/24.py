# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        dummy=ListNode(0)
        dummy.next=head
        fast=dummy
        
        while fast.next!=None and fast.next.next!=None:
            first=fast.next
            second=fast.next.next
            fast.next=second
            first.next=second.next
            second.next=first
            fast=fast.next.next
        return dummy.next