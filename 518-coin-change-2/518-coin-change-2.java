class Solution {
    public int change(int amount, int[] coins) {
        //create a array to store ans of sub problems
        int[] ch=new int[amount+1];
        //initialize oth element as 1 (base condition)
        ch[0]=1;
        //take each coin from coin array and fill the ch array to store sub-problem
        for(int coin:coins)
        {
            for(int i=coin;i<amount+1;i++)
            {
                ch[i]+=ch[i-coin];
            }
        }
        //return final result 
        return ch[amount];
        
    }
}