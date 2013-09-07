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
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        ListNode pNode = head;
        
        while(pNode!=null){
            if(map.get(pNode.val)==null) map.put(pNode.val,1);
            else{
                int count=map.get(pNode.val);
                count++;
                map.put(pNode.val,count);
            }
            pNode = pNode.next;
        }
        
        pNode = head;
        while(pNode!=null){
            ListNode nextNode = pNode.next;
            while(nextNode!=null && map.get(nextNode.val)>1){
                pNode.next =nextNode.next;
                //nextNode = null;
                nextNode = nextNode.next;
            }
            pNode = pNode.next;
        }
        
        pNode=head;
        if(map.get(pNode.val)>1){
            head=pNode.next;
            pNode=null;
        }
        
        return head;
    }
}
