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
    public ListNode mergeKLists(ListNode[] lists) {

         if(lists == null && lists.length == 0) {
            return null;
         }
         if(lists.length == 1) {
            return lists[0];
         }
        ListNode result = null;
         for(int i=0;i < lists.length ;i++) {
            result = mergeList(lists[i], result);
         }
         return result;
    }

    private ListNode mergeList(ListNode list , ListNode merge) {
        ListNode dummy = new ListNode(-1);
        ListNode resultList = dummy;
        if(merge == null) {
            return list;
        }
        if(list == null) {
            return merge;
        }
        while(list != null && merge != null) {
            if(list.val <= merge.val){
                resultList.next = list;
                list = list.next;
            }else {
                resultList.next = merge;
                merge = merge.next;
            }
            resultList = resultList.next;
        }

        if(list != null) {
            resultList.next = list;
        }

        if(merge != null) {
            resultList.next = merge;
        }

        return dummy.next;
    }
}
