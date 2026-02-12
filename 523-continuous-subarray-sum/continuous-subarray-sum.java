class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mod_index=new HashMap<>();
        mod_index.put(0,-1);
        int pre=0;
        for(int i=0;i<nums.length;i++){
            pre +=nums[i];
            int mod=pre%k;
            if(mod_index.containsKey(mod)){
                if(i-mod_index.get(mod)>=2) return true;
            }
            else{
                mod_index.put(mod,i);
            }
        }
        return false;
    }
}