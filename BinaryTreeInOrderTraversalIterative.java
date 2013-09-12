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
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root==null) return arr;
        TreeNode node = root;
        while(node!=null||!stack.isEmpty()){
            while(node!=null){
                stack.push(node);
                node = node.left;
            }
            
            node = stack.pop();
            arr.add(node.val);
            node = node.right;
        }
        return arr;
        
    }
    
    
}
