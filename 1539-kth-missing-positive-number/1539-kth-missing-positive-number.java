class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> dup = new ArrayList<>(); 
        int num = 1;
        int i = 0;
        while (num <= arr[arr.length-1]) {
            
            if (i<arr.length&&arr[i]==num) {
                i++;
            } 
            else {
                dup.add(num);
            }

            num++;
        }
        while (dup.size()<k) {
            dup.add(num);
            num++;
        }

        return dup.get(k-1);
    }
}