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
    public ListNode removeElements(ListNode head, int val) {

        if(head == null) return null;
        ListNode temp = head;   // temp hocche just ekta node jeita ek ek kore jaite thakbe 

        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;   // val er equal node gola remove kore dibe 
            }else{
                temp = temp.next;
            }
        }

        if(head.val == val) return head.next;   // for case 3, sob same hoile..jeheto loop e head er value check kora hoi nai
        else return head;
    }
}