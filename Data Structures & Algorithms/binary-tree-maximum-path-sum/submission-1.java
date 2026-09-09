/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxPathSum(TreeNode root) {
        int[] maxSum = new int[1];
        maxSum[0] = Integer.MIN_VALUE;
        pathSum(root,maxSum);
        return maxSum[0];
    }

    private int pathSum(TreeNode node,int[] max) {
        if(node == null) return 0;
        int lsum = Math.max(0,pathSum(node.left,max));
        int rsum = Math.max(0,pathSum(node.right,max));
        max[0] = Math.max(max[0], node.val+lsum+rsum);
        return Math.max(lsum,rsum)+ node.val;
    }
}
