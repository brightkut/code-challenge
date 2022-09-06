package leetcode.array.best_time_to_buy_and_sell_II_122;

public class Main {
    public static void main(String[] args) {
        int [] input = {7,1,5,3,6,4};

        System.out.println(maxProfit(input));
     }

     //O(n) do by myself
    public static int maxProfit(int[] prices) {
        //int buyTime = max value;
        //int profit = min value;
        //int maxProfit = 0;
        //int haveProfit = false

        //if price< buyTime set buy time = price
        //if price-buytim > profit  set profit set have profit true
        //if price-buytim < profit  && haveProfit
        // we sell setBuytime

        int buyTime = Integer.MAX_VALUE;
        int profit = 0 ;
        int maxProfit = 0;
        boolean hasProfit = false;
        //[7,1,5,3,6,4]

        for(int i =0 ; i < prices.length ; i++){

            if(prices[i] < buyTime && !hasProfit) buyTime = prices[i];

            int pf = prices[i] - buyTime;

            if(pf > profit) {
                profit = pf;
                hasProfit = true;
            }else if(pf < profit){
                maxProfit+=profit;
                profit=0;
                buyTime=prices[i];
                hasProfit = false;
            }

        }

        return maxProfit+profit;
    }

    //Dynamic Programming
    public int maxProfit2(int[] prices) {
        //[7,1,5,3,6,4]
        //[1,2,3,4]
        int buyingDate = 0, sellingDate = 0, profit = 0;
        for(int i = 1; i < prices.length;i++){
            //sell
            if(prices[i] >= prices[i-1]){
                sellingDate++;
            }else{
                //cheaper buy
                profit += prices[sellingDate] -  prices[buyingDate];
                buyingDate = sellingDate = i;
            }
        }
        profit += prices[sellingDate] -  prices[buyingDate];
        return profit;
    }
}
