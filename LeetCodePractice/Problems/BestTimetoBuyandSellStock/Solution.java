package BestTimetoBuyandSellStock;

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length==1) return 0;
        int maxprofit = 0;
        int curprofit = 0;
        int i = 1;
        while (i < prices.length){
            curprofit += (prices[i] - prices[i-1]); 
            if (curprofit > maxprofit) maxprofit = curprofit;
            if (curprofit < 0) curprofit = 0;
            i++;
        }
        return maxprofit;
    }
}
