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
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        HashSet<ListNode>  nodes = new HashSet<ListNode>();
        while (curr != null) {
            if(nodes.contains(curr)){
                return true;
            }
            nodes.add(curr);
            curr= curr.next;
        }
        return false;
    }
}
