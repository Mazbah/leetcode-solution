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
    int size(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = size(head);  // 1. calculate the size
        
        int x = size-n;  // 2. the value need to delete if traverse from 0;
        
        if(x==0){
            head = head.next;  // If need to delete the head at 0 index, then head is [1] value
        }else{
            for(int i=0;i<x-1;i++){
                temp = temp.next;   // till the deleted node
            }
            temp.next = temp.next.next;  // after the deleted node it will be point the next node.
        }
        
        return head;
    }
}