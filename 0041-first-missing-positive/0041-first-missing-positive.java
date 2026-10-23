class Solution {
    public int firstMissingPositive(int[] nums) {
      int l=nums.length;
      HashSet<Integer> h=new HashSet<>();
      for(int i=0;i<l;i++)
      {
        h.add(nums[i]);
      }
      int find=1;
      while(h.contains(find))
      {
        find++;
      }
      return find;
    }
}
