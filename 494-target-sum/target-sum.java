class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       return find(nums,target,0,0);
    }
    public int find(int[] nums,int t,int i,int sum){
        if(i==nums.length ){
            return sum==t?1:0;
        }
        int add=find(nums,t,i+1,sum+nums[i]);
        int sub=find(nums,t,i+1,sum-nums[i]);
        return add+sub;
    
    }
}