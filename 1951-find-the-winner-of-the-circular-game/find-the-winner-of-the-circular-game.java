class Solution {
    public int findTheWinner(int n, int k) {
       int ind=find(n,k);
       return ind+1;
    }
    public int find(int n,int k){
         if(n==1) return 0;
        return ((find(n-1,k)+k)%n);
    }
}