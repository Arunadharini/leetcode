class Solution {
    int minU=Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        int[] child= new int[k];
        minUnfair(0,cookies,child,k);
        return minU;
    }

    public void minUnfair(int i ,int[] cookies,int[] child,int k){
        if(i==cookies.length){
            int maxdiff=Integer.MIN_VALUE;
            for(int val:child){
                maxdiff=Math.max(maxdiff,val);
            }
            minU=Math.min(minU,maxdiff);
            return;
        }
        
        int cookie=cookies[i];
        for(int j=0;j<k;j++){
            child[j]+=cookie;
            minUnfair(i+1,cookies,child,k);
            child[j]-=cookie;
        }
    }
}