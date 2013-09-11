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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(l1==null) return l2;
        else if(l2==null) return l1;
        
        ListNode pNode1 = l1;
        ListNode pNode2 = l2;
        ListNode pHead = null;
        if(pNode1.val<pNode2.val){
            pHead = pNode1;
            pNode1 = pNode1.next;
        }else{
            pHead = pNode2;
            pNode2 = pNode2.next;
        }
        ListNode pResNode = pHead;
        
        
        while(pNode1!=null && pNode2!=null){
            if(pNode1.val<pNode2.val){
                pResNode.next = pNode1;
                pNode1 = pNode1.next;
            }else{
                pResNode.next = pNode2;
                pNode2 = pNode2.next;
            }
            pResNode = pResNode.next;
        }
        
        while(pNode1!=null){
            pResNode.next = pNode1;
            pNode1 = pNode1.next;
            pResNode = pResNode.next;
        }
        
         while(pNode2!=null){
            pResNode.next = pNode2;
            pNode2 = pNode2.next;
            pResNode = pResNode.next;
        }
        
        return pHead;
    }
}
