class Solution {
    public int search(int[] nums, int target) {
        int i;
        int x=nums.length-1;
        int l=0;
        while(l<=x)
        {
            int m=l+(x-l)/2;
            if(nums[m]==target)
            {
                return m;
            }
            else if(nums[m]<target)
            {
                l=m+1;
            }
            else if(nums[m]>target)
            {
                x=m-1;
            }
        }
        return -1;
    }
}