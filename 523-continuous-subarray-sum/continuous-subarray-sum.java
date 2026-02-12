class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(k==0){
            for(int i=1;i<nums.length;i++){
                if(nums[i]==0 && nums[i-1]==0){
                    return true;
                }
            }
            return false;
        }
        int[] pre = new int[nums.length];
        int[] mod=new int[nums.length];
        pre[0]=nums[0];
        mod[0]=nums[0]%k;
        HashMap<Integer,Integer> mod_index=new HashMap<>();
        mod_index.put(0,-1);
        mod_index.put(mod[0],0);
        for(int i=1;i<nums.length;i++){
            pre[i] =nums[i]+pre[i-1];
            mod[i]=pre[i]%k;
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