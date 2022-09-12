class Solution {
    public int maxProfit(int[] price) {
        int n=price.length;
        int profit=0;
        //start with index 1 and compare the price with previous day price  & calculate profit if any
        for(int i=1;i<n;i++)
        {
            if(price[i]>price[i-1])
                profit+=(price[i]-price[i-1]);
        }
        return profit;
    }
}