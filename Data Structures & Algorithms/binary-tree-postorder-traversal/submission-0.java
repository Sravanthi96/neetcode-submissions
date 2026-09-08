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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        if(root == null) {
            return postorder;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()) {
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            else{
                TreeNode temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    postorder.add(temp.val);
                    while(!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.pop();
                        postorder.add(temp.val);
                    }
                }else{
                    cur = temp;
                }
            }
        }
        return postorder;
    }
}