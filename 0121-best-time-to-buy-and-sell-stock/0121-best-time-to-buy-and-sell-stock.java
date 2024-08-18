class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,maxprofit=0, minprice=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            minprice=Math.min(minprice,prices[i]);
            profit=prices[i]-minprice;
            maxprofit= Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}