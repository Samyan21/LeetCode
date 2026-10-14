import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            l.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            l2.add(nums2[i]);
        }
        Iterator<Integer> it = l.iterator();
        while (it.hasNext()) {
            int val = it.next();

            if (!l2.contains(val) && !ans1.contains(val)) {
                ans1.add(val);
            }
        }
        Iterator<Integer> i = l2.iterator();
        while (i.hasNext()) {
            int val = i.next();
            if (!l.contains(val)&& !ans2.contains(val)) {
                ans2.add(val);
            }
        }
        List<List<Integer>> fans = new ArrayList<>();
        fans.add(ans1);
        fans.add(ans2);
        return fans;
    }
}
