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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null ) return head;
        ListNode ans = head;
        ListNode prev = head;
        head = head.next;
        while(head != null){
            //head = head.next;
            if(head.val == prev.val){
                prev.next = head.next;
                ListNode temp = head;
                head = head.next;
                temp.next = null;
            }else{
                prev = head;
                head = head.next;
            }
        }
        return ans;
    }
}