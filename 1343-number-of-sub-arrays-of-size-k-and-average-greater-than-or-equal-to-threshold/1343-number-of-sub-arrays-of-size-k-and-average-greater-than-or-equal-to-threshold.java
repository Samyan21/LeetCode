class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i,c=0,sum=0;
        double avg=0;
        for(i=0;i<k;i++)
        {
            sum+=arr[i];
            avg=sum/k; 
        }
        if(avg>=threshold)
            c+=1;
        for(i=1;i<=arr.length-k;i++)
        {
            sum=sum-arr[i-1]+arr[i+k-1];
            avg=sum/k;
            if(avg>=threshold)
            {
                c+=1;
            }
        }
        return c;
        
    }
}