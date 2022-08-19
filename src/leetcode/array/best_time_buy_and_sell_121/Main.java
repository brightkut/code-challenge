package leetcode.array.best_time_buy_and_sell_121;

public class Main {
    public static void main(String[] args) {

    }

    //brute force O(n2)
    public int maxProfit(int[] prices) {

        //find the minimum and buy max after min index
        int min = Integer.MAX_VALUE;
        for (int i =0 ; i< prices.length ; i++){
            for(int j = i ; j< prices.length; j++){
                if(prices[i]-prices[j]< min) min =prices[i]-prices[j];
            }
        }

        return Math.abs(min);
    }

     public static int maxProfit2(int [] prices){
        //buy when min and sell max

         int max = Integer.MAX_VALUE;
         int min = 0;

         for (int i =0 ; i< prices.length ; i++){
             if(prices[i]<max) max = prices[i];

             int profit = prices[i] - max;

             if(profit > min){
                 min = profit;
             }
         }

         return min;
     }
}
