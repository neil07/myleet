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
    private ArrayList<ArrayList<Integer>> mList;
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
    	// Start typing your Java solution below
		// DO NOT write main() function
        mList = new ArrayList<ArrayList<Integer>>();
		Stack<Integer> stack = new Stack<Integer>();
		pathSumCore(root, stack, 0, sum);
		return mList;
	}

	public void pathSumCore(TreeNode root, Stack<Integer> stack,
			int sumCalc, int sum) {
		if (root == null)
			return;
        stack.push(root.val);
        sumCalc += root.val;
        
        boolean isLeaf = (root.left == null && root.right == null);
		if ( isLeaf && sumCalc == sum) {
			ArrayList<Integer> tmparr = new ArrayList<Integer>();
			for (int i = 0; i < stack.size(); i++) {
				tmparr.add(stack.get(i));
			}
			mList.add(tmparr);
		}

		if (root.left != null) {
			pathSumCore(root.left, stack, sumCalc, sum);
		}
		if (root.right != null) {
			pathSumCore(root.right, stack, sumCalc, sum);
		}
        
        stack.pop();
	}
}
