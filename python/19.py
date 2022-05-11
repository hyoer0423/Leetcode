# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        def remove_end(node,n):
            if node==None:
                return node,0
            no,c=remove_end(node.next,n)
            c=c+1
            node.next=no
            if c==n:
                node=node.next
            return node,c
        return remove_end(head,n)[0]

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        dummynode=ListNode(0)
        dummynode.next=head
        slow=fast=dummynode
        for i in range(n):
            fast=fast.next
        while fast.next:
            slow=slow.next
            fast=fast.next
        slow.next=slow.next.next
        return dummynode.next