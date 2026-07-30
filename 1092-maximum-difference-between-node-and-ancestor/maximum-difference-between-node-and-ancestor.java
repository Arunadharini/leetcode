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
    int ans=0;
    public int maxAncestorDiff(TreeNode root) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        findDiff(root,max,min) ;
        return ans;
    }
    public void findDiff(TreeNode root,int max,int min){

        if(root==null){
            return;
        }
        max=Math.max(max,root.val);
        min=Math.min(min,root.val);
        ans=Math.max(ans,max-min);

        findDiff(root.left,max,min);
        findDiff(root.right,max,min);
    }
}