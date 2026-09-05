class Solution {
    public int[] runningSum(int[] nums) {
        int i,x=nums.length;
        for(i=1;i<x;i++)
        {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}