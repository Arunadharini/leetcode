class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int[] mod=new int[nums.length];
        HashMap<Integer,Integer> mod_index=new HashMap<>();
        mod_index.put(0,-1);
        int pre=0;
        for(int i=0;i<nums.length;i++){
            pre +=nums[i];
            mod[i]=pre%k;
            if(i>0 && mod[i]==0) return true;
            if(mod_index.containsKey(mod[i])){
                if(i-mod_index.get(mod[i])>=2) return true;
            }
            else{
                mod_index.put(mod[i],i);
            }
        }
        return false;
    }
}