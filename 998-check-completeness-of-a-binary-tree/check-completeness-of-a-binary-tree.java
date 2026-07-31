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
    int count=0;
    public boolean isCompleteTree(TreeNode root) {
        count=countNodes(root);
        return checkComplete(root,0);
    }
    public int countNodes(TreeNode root){
        if(root==null) return 0;
        int l=countNodes(root.left);
        int r=countNodes(root.right);
        return l+r+1;
    }
    public boolean checkComplete(TreeNode root,int i){
        if(root==null) return true;
        if(i>=count) return false;
        boolean left =checkComplete(root.left,2*i+1);
        boolean right=checkComplete(root.right,2*i+2);
        return left && right;
    }

}