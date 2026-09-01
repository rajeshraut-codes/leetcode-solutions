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
    ListNode dummy;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        this.dummy = new ListNode(0, null);
        ListNode head = dummy;

        while(list1 != null || list2 != null){
            if(list1 != null && list2 != null){
                if(firstNodeHigher(list1, list2)){
                    createLink(list2);
                    list2 = list2.next;
                } else if(secondNodeHigher(list1, list2)) {
                    createLink(list1);
                    list1 = list1.next;
                } else {
                    createLink(list1);
                    list1 = list1.next;
                    createLink(list2);
                    list2 = list2.next;
                }
            } else if(list1 != null){
                createLink(list1);
                list1 = list1.next;
            } else { //list2
                createLink(list2);
                list2 = list2.next;
            }
        }
        return head.next;
    }

    private static boolean firstNodeHigher(ListNode list1, ListNode list2) {
        int v1 = list1.val;
        int v2 = list2.val;

        return v1 > v2;
    }

    private static boolean secondNodeHigher(ListNode list1, ListNode list2) {
        int v1 = list1.val;
        int v2 = list2.val;

        return v1 < v2;
    }

    private void createLink(ListNode n){
        ListNode f = new ListNode(n.val, null);
        this.dummy.next = f;
        this.dummy = f;
    }
}