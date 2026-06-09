class Solution {
    public int fib(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fibin(n,dp);
        }
    public int fibin(int n ,int[] dp){
        if(n==0 || n==1) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fibin(n-1,dp)+fibin(n-2,dp);
    }    
}