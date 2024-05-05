/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return; // Cannot delete if node is null or last node
        }
        
        // Copy the value of the next node to the current node
        node.val = node.next.val;
        
        // Delete the next node
        node.next = node.next.next;
    }
}