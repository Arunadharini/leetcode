class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int r=0;
        int l=0;
        int minlen=Integer.MAX_VALUE;
        int len =0;
        int sum =0;
        while(r<nums.length&&l<=r){
            sum+=nums[r];
            //if(sum<target) r++;
            while(sum>=target){
                len=r-l+1;
                minlen=Math.min(len,minlen);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        if(minlen==Integer.MAX_VALUE) return 0;
        return minlen;
    }
}