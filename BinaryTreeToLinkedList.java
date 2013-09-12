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
    public void flatten(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        stack.push(root);
        TreeNode prev = null;
        
        while(!stack.isEmpty()){
            TreeNode top = stack.pop();
            if(prev!=null) {
                prev.left = null;
                prev.right = top;
            }
            prev = top;
            if(top.right!=null) stack.push(top.right);
            if(top.left!=null) stack.push(top.left);
        }
    }
}
