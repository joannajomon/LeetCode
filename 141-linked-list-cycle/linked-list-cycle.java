/*
 class ListNode {
      int val;
    ListNode next;
      ListNode(int x) {
         val = x;
          next = null;
      }
  }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet <ListNode> dup = new HashSet<>();
        ListNode temp=head;
        
        while(temp!= null)
         {
          
         
            if (!dup.add(temp)) {
                return true;
                }
              dup.add(temp);
             
            temp=temp.next;
             
         }
         return false;
    }
}