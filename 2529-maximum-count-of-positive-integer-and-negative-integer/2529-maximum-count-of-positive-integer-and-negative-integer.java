class Solution {
    public int maximumCount(int[] nums) {
        int pos=0,neg=0;
        int l=nums.length;
        int i;
        for(i=0;i<l;i++)
        {
            if(nums[i]<0)
            {
                neg++;
            }
            else if(nums[i]>0)
            {
                pos++;
            }
            else
            {
                continue;
            }
        }
        return Math.max(pos,neg);
        
    }
}