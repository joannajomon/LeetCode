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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode add=new ListNode();
        ListNode current= add;
        int carry=0,digit,data,l1val=0,l2val=0;

        while(l1!=null|| l2!=null){
           
            if(l1!=null)
                l1val=l1.val;
            if(l2!=null){ 
                l2val=l2.val;
                }
            data=l1val+l2val+carry;
            carry=data/10;
            digit=data%10;
            current.next= new ListNode(digit);
            current=current.next;
           if(l1!=null)
              l1=l1.next;
           if(l2!=null)
              l2=l2.next;
            l1val=0;
            l2val=0;
            }
           
             
           
       
          

        
        if(carry>0){
           current.next= new ListNode(carry);
        }
        return add.next;
    }
}