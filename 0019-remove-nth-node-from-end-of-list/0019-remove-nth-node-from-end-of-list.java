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
        ListNode ans = head;
        ListNode temp = head;
        int len = 1;
        while(temp.next != null) {
            temp = temp.next;
            ++ len;
        }
        int trav = len - n  ;
        System.out.println(trav);
        if (trav == 0) return head.next;
        for(int i=2;i<=trav;i++){
            head = head.next;
        }
        head.next = head.next.next;
        return ans;
    }
}