class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int maxP = 0;
        int minP = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            minP = Math.min(minP,prices[i]);
            maxP = Math.max(prices[i]-minP,maxP);
        }
        return maxP;
    }
}