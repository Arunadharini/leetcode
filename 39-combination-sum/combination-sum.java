class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp= new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        combination(0,target,0,temp,res,candidates);
        return res;
        
    }
    public void combination(int i , int t,int currSum, List<Integer> temp ,List<List<Integer>>res,int[] arr){
        if(currSum==t){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(i==arr.length|| currSum>t) return;

       //pick-If you pick the current index you can pick it again
       temp.add(arr[i]);
       combination(i,t,currSum+arr[i],temp,res,arr);
       temp.remove(temp.size()-1);

       //not pick-the current index is not picked and index is skipped to next index
       //currsum wont change as the current index is skipped and not so nothing is added
       combination(i+1,t,currSum,temp,res,arr);
    }
}