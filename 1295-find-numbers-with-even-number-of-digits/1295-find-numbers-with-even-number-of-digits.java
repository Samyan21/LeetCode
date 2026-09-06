class Solution {
    public int findNumbers(int[] nums) {
        int i,x=nums.length;
        int fin=0;
        for(i=0;i<x;i++)
        {
            int y=nums[i];
            int count=0;
            while(y!=0)
            {
                int rem=y%10;
                count=count+1;
                y/=10;
            }
            if(count%2==0)
            {
                fin+=1;
            }
        }
        return fin;
        
    }
}