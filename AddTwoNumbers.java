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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(l1==null&&l2==null) return null;
        ListNode pNode1 = l1;
        ListNode pNode2 = l2;
        ListNode pResHead = null;
        ListNode pResNode = null;
        
        int carry = 0;
        while(pNode1!=null||pNode2!=null){
            int a = 0;
            int b = 0;
            int c = 0;
            if(pNode1!=null) a = pNode1.val;
            if(pNode2!=null) b = pNode2.val;
            
            int sum = a+b+carry;
            if(sum>=10) {
                c = sum-10;
                carry=1;
            }else {
                c = sum; 
                carry=0;
            }
            ListNode node = new ListNode(c);
            if(pResHead==null){
                pResNode = node;
                pResHead = pResNode;
            }else{
                pResNode.next = node;
                pResNode=pResNode.next;
            }
            
            if(pNode1!=null) pNode1 = pNode1.next;
            if(pNode2!=null) pNode2 = pNode2.next;
        }
        if (carry>0){
             ListNode node = new ListNode(carry);
             pResNode.next=node;
        }
        
        return pResHead;
    }
}
