class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i,sum=0;
        for(i=0;i<k;i++)
        {
            sum+=nums[i];
        }  
        int max=sum;
        for(i=k;i<nums.length;i++)
        {
            sum=sum-nums[i-k]+nums[i];
            max=Math.max(max,sum);
        } 
        return (double) max/k;     
    }
}