class Solution {
    public boolean isUgly(int n) {
    int prev = n+1;
    if(n==1) return true;
      while(n>=1 && prev!=n){ 
        prev=n;
        if(n%2==0) n=n/2;
        if(n%3==0) n=n/3;
        if(n%5==0) n=n/5;
      }
    if(n==1) return true;
    return false;
    }
}