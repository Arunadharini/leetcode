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
    public int sumOfLeftLeaves(TreeNode root) {
        return callNode(root ,false);
    }
    public int  callNode(TreeNode root , boolean Leftchild){
        if(root==null) return 0;

        if(root.left==null && root.right==null){
            if(Leftchild) return root.val;
        }

        int left=callNode(root.left,true);
        int right=callNode(root.right,false);
        return left+right;
    }
}