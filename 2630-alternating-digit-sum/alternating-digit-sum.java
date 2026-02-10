class Solution {
    public int alternateDigitSum(int n) {
        int digits= (int)Math.log10(n)+1;
        boolean pos=true;
        if(digits%2==0) pos =false;
        int sum=0;
        while(n>0){
            if(pos) {
                sum+=n%10;
                }
            else{
                sum-=n%10;   
            }
            pos=!pos;
            n=n/10;

        }
        return sum;
    }
}