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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       // calculate size of ll
       int size = 0;
       ListNode temp = head;
       while(temp != null) {
        temp = temp.next;
        size++;
       } 

       if(n == size) {
        head = head.next; // remove First
        return head;
       }

       // size-n
       int i = 1;
       int iToFind = size-n;
       ListNode prev = head;
       while(i < iToFind) {
        prev = prev.next;
        i++;
       }
       prev.next = prev.next.next;
       return head;

    }
}