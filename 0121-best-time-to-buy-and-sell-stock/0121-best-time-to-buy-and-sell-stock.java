class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;

        int minprice=Integer.MAX_VALUE , maxprofit=Integer.MIN_VALUE; 

        for(int i=0;i<n;i++){
            minprice=Math.min(minprice, prices[i]);
            maxprofit=Math.max(maxprofit, prices[i]-minprice);
        }
        return maxprofit;
    }
}