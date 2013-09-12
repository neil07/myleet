/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int sumAll = 0;
    public int sumNumbers(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        sumAll = 0;
        Stack<Integer> stack=new Stack<Integer>();
        sumNumberCore(root,stack);
        return sumAll;
    }
    
    public void sumNumberCore(TreeNode root,Stack<Integer> stack){
        if(root==null) return;
        
        stack.push(root.val);
        
        if(root.left==null && root.right==null){
            int sum = 0;
            int digit=0;
            for(int i=stack.size()-1;i>=0;i--){
                sum += stack.get(i)*Math.pow(10,digit++);
            }
            sumAll += sum;
            
        }
        if(root.left!=null) sumNumberCore(root.left,stack);
        if(root.right!=null) sumNumberCore(root.right,stack);
        
        stack.pop();
    }
}
