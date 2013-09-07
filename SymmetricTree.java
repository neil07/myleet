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
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return true;
        if(root.left==null&&root.right==null) return true;
        if(root.left!=null && root.right!=null){
            return isSymmetric(root.left,root.right);
        }
        
        return false;
        
    }
    
    
    public boolean isSymmetric(TreeNode left, TreeNode right){
        if(left==right) return true;
        else if(left==null) return false;
        else if (right==null) return false;
        if(left.val==right.val){
            return isSymmetric(left.right,right.left)&&isSymmetric(left.left,right.right);
        }
        
        return false;
        
    }
}
