import java.util.ArrayList;

class Solution {
    public int maxProfit(int[] prices) {
        ArrayList<Integer> profitArray = new ArrayList<Integer>();
        int stock = 0;
        int minValue = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {

            profit = prices[i] - minValue;

            if (profit >= 0) {
                profitArray.add(profit);
            }

            if (minValue > prices[i]) {
                minValue = prices[i];
            }

        }
        Collections.sort(profitArray, Collections.reverseOrder());
        if(!profitArray.isEmpty()){
        stock = profitArray.get(0);
        }
        else{
            System.out.println("Index out of bound");
        }
        return stock;
    }
}