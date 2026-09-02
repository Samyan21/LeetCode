class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i, end,start=0;
        int l=numbers.length;
        end=l-1;
        for(i=0;i<l;i++)
        {
            if(numbers[start]+numbers[end]>target)
            {
                end=end-1;
            }
            else if(numbers[start]+numbers[end]<target)
            {
                start=start+1;
            }
            else if(numbers[start]+numbers[end]==target)
            {
                break;
            }
        }
        return new int[]{start+1, end+1};
    }
}