class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int[] lmin = new int[2];
        lmin[0] = 0;                 
        lmin[1] = prices[0];

        //lmin[0] => index
        //lmin[1] => price
        
        int maxProfit = 0;

        for (int i=1; i<prices.length; i++) {
            if (prices[i] < lmin[1]) {
                lmin[0] = i;
                lmin[1] = prices[i];
            } 
            else if (prices[i]-lmin[1] > maxProfit) {
                maxProfit = prices[i] - lmin[1];
            }
        }

        return maxProfit;
    }
}
