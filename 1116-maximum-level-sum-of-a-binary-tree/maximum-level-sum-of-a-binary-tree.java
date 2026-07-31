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
   
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int sum=Integer.MIN_VALUE;
        int level=0;
        int ans=level;

        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            int currsum=0;
            level++;
            for(int i=0;i<size;i++){

                TreeNode pop=q.poll();
                currsum+=pop.val;

                if(pop.left!=null) q.add(pop.left);
                if(pop.right!=null)  q.add(pop.right);
            }
            if(currsum>sum){
                sum=currsum;
                ans=level;
            }
        }
        return ans;
    }
}