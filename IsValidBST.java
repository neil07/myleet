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
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return true;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        traverseTree(root,arr);
        
        boolean res = true;
        int prev = Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<=prev){
                res = false;
                break;
            }else{
                prev = arr.get(i);
            }
        }
        return res;
    }
    
    public void traverseTree(TreeNode root, ArrayList<Integer> arr){
        if(root==null) return;
        if(root.left!=null) traverseTree(root.left,arr);
        arr.add(root.val);
        if(root.right!=null) traverseTree(root.right,arr);
    }
    
}
