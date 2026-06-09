class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return(houserob(nums,nums.length-1,dp));
    }
    public int houserob(int[] num , int n,int[] dp ){
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int steal=num[n]+houserob(num,n-2,dp);
        int notsteal=houserob(num,n-1,dp);
        return dp[n]=Math.max(steal,notsteal);
    }
}