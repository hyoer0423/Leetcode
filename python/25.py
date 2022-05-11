# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseKGroup(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        dummy=jump=Node(0)
        dummy.next=l=r=head
        start=0
        while True:
            start=0
            while r and start<k:
                r.next=r
                start+=1
            if start==k:
                pre,cur=r,l
                for _ in range(k):
                    cur.next,cur,pre=pre,cur.next,cur
                jump.next,jump,l=pre,l,r
            else:
                return dummy.next
            
            
            
            