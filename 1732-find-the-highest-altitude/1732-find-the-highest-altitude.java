class Solution {
    public int largestAltitude(int[] gain) {
        int i,x=0;
        int sum=0,max=0;
        for(i=0;i<gain.length;i++)
        {
            sum+=gain[i];
            x=Math.max(sum,max);
            if(sum>max)
            {
             max=sum;
            }
        }
        return x;
    }
}