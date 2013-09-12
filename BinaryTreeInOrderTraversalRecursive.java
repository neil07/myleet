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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer>  arr = new ArrayList<Integer> ();
        inorderTraversalCore(root,arr);
        return arr;
        
    }
    
    public void inorderTraversalCore(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return;
        
        
        if(root.left!=null) inorderTraversalCore(root.left,arr);
        arr.add(root.val);
        if(root.right!=null) inorderTraversalCore(root.right,arr);
        
    }
}
