class Solution {
    public int longestMountain(int[] arr) {
        int up=0;
        int down=0;
        int ans=0;
        for(int i =0;i<arr.length-1;i++){
            if(down>0&& arr[i]<arr[i+1] || arr[i]==arr[i+1]){
                up=0;
                down=0;
            }
            if(arr[i]<arr[i+1]){
                up++;
            }
            else{
                down++;
            }
            if(up>0 && down>0){
                ans=Math.max(up+down+1,ans);
            }
        }
return ans;
    }
}