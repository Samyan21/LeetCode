class Solution {
    public int maximumWealth(int[][] accounts) {
        int x=0;
        for(int i=0;i<accounts.length;i++)
        {
            int y=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                y+=accounts[i][j];
            }
            if(y>x)
            {
                x=y;
            }
        }  
        return x;      
    }
}