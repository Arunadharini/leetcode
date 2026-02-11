class Solution {
    public int[] twoSum(int[] numbers, int target) {
       for(int i=0;i<numbers.length;i++){
        int need =target-numbers[i];
        int ind =find(i ,need ,numbers);
        if(ind!=-1){
            return new int[]{i+1 , ind+1};
        }
       }
       return new int[]{-1,-1};
    }
    public int find(int idx ,int need,int[] nums){
        int low = idx+1;
        int high = nums.length-1;
            while(low<=high){
            int mid=(low+high)/2;
            if(need==nums[mid]) return mid;
            else if(nums[mid]<need) {
                low=mid+1;
            }
            else high =mid-1;
        }
        return -1;
    }
}