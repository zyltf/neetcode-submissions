class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int i= 0,j = 1;

        while (j<prices.length) {
            if (prices[j]-prices[i] > max) max = prices[j]-prices[i];
            else if (prices[i]>prices[j]) i=j;
            j++;
        }

        return max;
    }
}
