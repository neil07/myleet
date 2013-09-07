/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null) return null;
        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        
        ListNode pNode = head;
        map.put(pNode.val,true);
        
        while(pNode!=null){
            
            ListNode nextNode = pNode.next;
            while(nextNode!=null && map.get(nextNode.val)!=null){
                pNode.next =nextNode.next;
                //nextNode = null;
                nextNode = nextNode.next;
            }
            
            if(nextNode!=null) map.put(nextNode.val,true);
            pNode = pNode.next;
        }
        
        return head;
    }
}
