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
    public boolean isBalanced(TreeNode root) {
        int hl, hr;
        
        if (root == null){
            return true;
        }
        
        hl = height(root.left);
        hr = height(root.right);
        
        if (Math.abs(hl - hr) <= 1 && isBalanced(root.right) && isBalanced(root.left)){
            return true;
        }
        return false;
    }
    
    public int height(TreeNode root){
        if (root == null){
            return 0;
        }
        
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
