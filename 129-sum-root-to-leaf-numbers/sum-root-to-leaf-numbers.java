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
    int sum=0;
    public int sumNumbers(TreeNode root) {
       findSum(root,0);  
       return sum;
    }
    public void findSum(TreeNode root , int prev){
        if(root==null) return ;
        if(root.right==null && root.left==null) {
            sum+=prev*10+root.val;;
            return;
        } 
        prev=prev*10+root.val;
        findSum(root.left,prev);
        findSum(root.right,prev);
        return ;
    }
}