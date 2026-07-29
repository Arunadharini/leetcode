class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        int count=0;
        List<Integer> temp = new ArrayList<>();
        return findSub(0,nums,k,temp)-1;
        //-1 --coz we dont need to count empty subset again

    }

    public int findSub(int i,int[] nums,int k ,List<Integer> temp){
        if(i==nums.length) return 1;

        //pick
        int pick=0;
        if(!temp.contains(nums[i]+k) && !temp.contains(nums[i]-k)){
            temp.add(nums[i]);
           pick=findSub(i+1,nums,k,temp);
           temp.remove(temp.size()-1);
        }

        //not pick 
        int not_pick=findSub(i+1,nums,k,temp);

        return pick+not_pick;
    }
}