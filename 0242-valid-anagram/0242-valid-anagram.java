import java.util.Hashtable;
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Hashtable<Character, Integer> h = new Hashtable<>();
        for (char c : s.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!h.containsKey(c) || h.get(c) == 0) {
                return false;
            }
            h.put(c, h.get(c) - 1);
        }
        return true;
    }
}