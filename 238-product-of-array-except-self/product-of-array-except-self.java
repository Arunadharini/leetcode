class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int[] product= new int[n];
        product[0]=nums[0];
        for(int i =1;i<n;i++){
            product[i]=product[i-1]*nums[i];
        }
        int rightprod=1;
        for(int i=n-1;i>=0;i--){
            int left=(i==0)? 1 : product[i-1];
            product[i]=left*rightprod;
            rightprod*=nums[i];
        }
        return product;
    }
}