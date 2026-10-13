class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> h =new HashSet<>();
        int l= paths.size();
        for(int i=0;i<l;i++)
        {
            h.add(paths.get(i).get(0));
        }
        for(int i=0;i<l;i++)
        {
            String city =paths.get(i).get(1);
            if(!h.contains(city))
            {
                return city;
            }
        }
        return " ";   
    }
}