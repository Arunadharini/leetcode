class Solution {
    List<List<Integer>> res =new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp= new ArrayList<>();
        find(0,nums,temp,res);
        return res;
        //temp-temp list
        //res-final array
    }
    public void find(int i,int[]nums,List<Integer> temp,List<List<Integer>>res){
        if(i==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        //pick
        temp.add(nums[i]);
        find(i+1,nums,temp,res);
        temp.remove(temp.size()-1);

        //not pick
        find(i+1,nums,temp,res);
    }
}