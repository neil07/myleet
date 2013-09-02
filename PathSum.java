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
    public boolean hasPathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
       return pathSumCore(root,0,sum);
    }
    
    
    public boolean pathSumCore(TreeNode root,int sumCalc,int sum){
        if(root==null) return false;
        if(root.left==null&&root.right==null){
            sumCalc += root.val;
            if(sum == sumCalc) return true;
            else return false;
        }
        
        boolean leftBool = false;
        boolean rightBool = false;
        if(root.left!=null){
            leftBool = pathSumCore(root.left,sumCalc+root.val,sum);
        }
        if(root.right!=null){
            rightBool = pathSumCore(root.right,sumCalc+root.val,sum);
        }
        return leftBool||rightBool;
    }
}
