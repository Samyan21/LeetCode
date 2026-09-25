class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int lon=0;
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int c=num;
                int count=1;
            
            while(set.contains(c+1))
            {
                c+=1;
                count+=1;
            }
            lon=Math.max(lon,count);
        }
        }
        return lon;
    }
    
}    