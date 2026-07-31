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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            int size=q.size();

            for(int i =0;i<size;i++){
                TreeNode popp=q.poll();

                temp.add(popp.val);
                if(popp.left!=null) q.add(popp.left);
                if(popp.right!=null) q.add(popp.right);
            }
            res.add(temp);
        }
        return res;
    }
}