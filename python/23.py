# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """
        dummy = ListNode(None)
        curr = dummy
        q=PrioritQueue()
        for node in lists:
            if node: q.put((node.val,node))
        while q.qsize()>0:
            curr.next=q.get()[1]
            curr=curr.next
            if curr.next:q.put((curr.next.val, curr.next))
        return dummy.next