class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Boolean> pres=new HashMap<>();
        for(int i=1;i<=nums.length;i++){
            pres.put(i,false);
        }
        for(int i=0;i<nums.length;i++){
            if(pres.containsKey(nums[i])) pres.put(nums[i],true);
        }
        for(Map.Entry<Integer,Boolean> key : pres.entrySet()){
            if(key.getValue() == false ) return key.getKey();
        }
        return nums.length+1;
    }
}