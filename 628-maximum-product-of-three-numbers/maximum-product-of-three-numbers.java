class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int i =nums.length;
        int max=Math.max(nums[0]*nums[1]*nums[2],nums[i-1]*nums[i-2]*nums[i-3]);
        max=Math.max(nums[i-1]*nums[1]*nums[0],max);
        return max;
        }
}