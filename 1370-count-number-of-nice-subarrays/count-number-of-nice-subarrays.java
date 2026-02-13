class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int oddcount =0;
        int left=0;
        int sub=0;
        int even_so_far=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2==1){
                oddcount++;
                even_so_far=0;
            }
            while(oddcount>k){
                    if(nums[left]%2==1) {
                        oddcount--;
                    }
                    left++;
                }
            while(nums[left]%2==0 && oddcount==k){
                    left++;
                    even_so_far++;
            }
           if(oddcount==k){
            sub+=even_so_far+1;
           }
        } 
        return sub;
        }
}