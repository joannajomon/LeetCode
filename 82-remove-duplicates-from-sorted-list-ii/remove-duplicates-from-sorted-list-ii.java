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
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode ptr=head;
        ListNode prev=dummy;
       while(ptr!=null){
           
           
           if(ptr.next!=null &&ptr.val==ptr.next.val ){
                while(ptr.next!=null && ptr.val==ptr.next.val){
                    ptr=ptr.next;
                }
                prev.next=ptr.next;
           }
           else{
             prev=prev.next;
           }
           ptr=ptr.next;

           

       }
    
        
        return dummy.next;
    }
}