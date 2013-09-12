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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(root==null) return res;
        Queue<TreeNode> queueNode = new LinkedList<TreeNode>();
        Queue<Integer> queueDepth = new LinkedList<Integer>();
        
        queueNode.add(root);
        queueDepth.add(0);
        
        while(!queueNode.isEmpty()){
            TreeNode node = queueNode.poll();
            int depth = queueDepth.poll();
            ArrayList<Integer> arr = null;
            if(res.size()<depth+1) {
                arr=new ArrayList<Integer>();
                res.add(arr);
            }
            else arr = res.get(depth);
            arr.add(node.val);
            if(node.left!=null){
                queueNode.add(node.left);
                queueDepth.add(depth+1);
            }
            if(node.right!=null){
                queueNode.add(node.right);
                queueDepth.add(depth+1);
            }
        }
        
        return res;
        
    }
}
