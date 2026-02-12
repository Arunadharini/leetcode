class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> sum=new HashMap<>();
        int add=0;
        int len=0;
        sum.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) nums[i]=-1;
            add+=nums[i];
            if(sum.containsKey(add)){
                len=Math.max(len,i-sum.get(add));
            }
            else{
                sum.put(add,i);
            }
        }
        return len;
    }
}