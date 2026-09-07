class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i,c=0;
        double m=0.0;
        int x=nums.length;
        for(i=0;i<k;i++)
        {
            c+=nums[i];
        }
        m=c;
        for(i=1;i<=x-k;i++)
        {
            c=c-nums[i-1]+nums[i+k-1];
            if(c>m)
            {
                m=c;
            }
        }
        m/=k;
        return m;


        
    }
}