# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    
        
    def mergeKLists(self, lists):
        if not lists:
            return None
        
        return self.divide(lists, 0, len(lists)-1)

    def divide(self, lists, left, right):
        if left == right:
            return lists[left]

        mid = (right + left) // 2

        l1 = self.divide(lists, left, mid)

        l2 = self.divide(lists, mid+1, right)

        return self.MergeTwoLists(l1, l2)

    def MergeTwoLists(self, l1, l2):

        dummy = ListNode()
        current = dummy

        while l1 and l2:

            if l1.val < l2.val:
                current.next = l1
                l1 = l1.next

            else:
                current.next = l2
                l2 = l2.next

            current = current.next

        current.next = l1 if l1 else l2

        return dummy.next


            