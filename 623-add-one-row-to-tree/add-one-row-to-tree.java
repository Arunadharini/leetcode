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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return add(root,val,depth,1);
    }
    public TreeNode add(TreeNode root, int val , int depth , int now){
        if(root==null){    
            return null;
        }
        if(depth==1){
            TreeNode newNode=new TreeNode(val);
            newNode.left=root;
            return newNode;
        }
        if(now==depth-1){
            TreeNode newNode=new TreeNode(val);
            TreeNode newNode1=new TreeNode(val);
            TreeNode oldRight=root.right;
            TreeNode oldLeft=root.left;
            root.left=newNode1;
            root.right=newNode;
            newNode1.left=oldLeft;
            newNode.right=oldRight;
            return root;
        }
        root.left=add(root.left,val,depth,now+1);
        root.right=add(root.right,val,depth,now+1);
        return root;
    }
}