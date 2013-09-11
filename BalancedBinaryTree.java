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
    public boolean isBalanced(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int[] depth={0};
        return isBalancedCore(root,depth);
    }
    
    public boolean isBalancedCore(TreeNode root,int[] depth){
        if(root==null) return true;
        
        int[] left={0};
        int[] right={0};
        if(isBalancedCore(root.left,left)&&isBalancedCore(root.right,right)){
            int diff = left[0]-right[0];
            if(diff>=-1 && diff<=1){
                depth[0] = (left[0]>right[0])?(left[0]+1):(right[0]+1);
                return true;
            }
          
        }
        return false;
        
    }
}
