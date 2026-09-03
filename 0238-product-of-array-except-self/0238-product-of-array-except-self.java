class Solution {
    public int[] productExceptSelf(int[] nums) {
         int n = nums.length;
        int[] copy = new int[n];
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            copy[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            copy[i] *= suffix;
            suffix *= nums[i];
        }
        return copy;
    }
}