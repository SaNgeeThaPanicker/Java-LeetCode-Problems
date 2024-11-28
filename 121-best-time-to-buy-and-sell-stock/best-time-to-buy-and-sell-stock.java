import java.util.ArrayList;

class Solution {
    public int maxProfit(int[] prices) {
 int [] profitArray = new int[prices.length];
        int stock=0;int minValue=prices[0];
        int profit=0;
        int j=0;


        for (int i=0;i<prices.length;i++) {

            profit = prices[i] - minValue;

            if(profit>=0) {
                profitArray[j]=profit;
                j++;
            }

            if (minValue > prices[i]) {
                minValue = prices[i];
            }

        }
        Arrays.sort(profitArray);
        stock=profitArray[prices.length-1];

        return stock;
    }
}