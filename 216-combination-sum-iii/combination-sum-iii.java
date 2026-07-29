class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> temp =new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        findC(k,n,1,0,res,temp);
        return res;
        
    }
    public void findC(int k ,int n , int curr,int sum,List<List<Integer>> res , List<Integer> temp){
        if(sum==n && temp.size()==k){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(curr==10) return;

        //pick
        temp.add(curr);
        findC(k,n,curr+1,sum+curr,res,temp);
        temp.remove(temp.size()-1);

        //notpick
        findC(k,n,curr+1,sum,res,temp);
}
}