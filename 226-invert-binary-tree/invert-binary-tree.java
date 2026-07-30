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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        if(root.left==null && root.right==null) return root;
        TreeNode lefttt=invertTree(root.right);
        TreeNode righttt=invertTree(root.left);
        root.left=lefttt;
        root.right=righttt;
        return root;

    }
}