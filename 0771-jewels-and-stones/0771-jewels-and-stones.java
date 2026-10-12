import java.util.*;
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> ch = new HashSet<>();
        int num=0,i=0;
        for(i=0;i<jewels.length();i++)
        {
            ch.add(jewels.charAt(i));       
        }
        for(i=0;i<stones.length();i++)
        {
            if(ch.contains(stones.charAt(i)))
            {
                num++;
            }
        }
        return num;
        
    }
}