package leetcode;

public class best_buyAndsell {
    public static void main(String[] args) {
        int [] price = {7,3,1,5,6,4};
        System.out.println(MaxProfit(price));
    }
    public static int MaxProfit(int[] prices){
        int buy = prices[0];
        int profit = 0;
        for(int i = 1;i< prices.length;i++){
            if(prices[i]>buy){
                profit =Math.max(profit,prices[i]-buy);
            }
            buy = Math.min(buy,prices[i]);
        }

        return profit;
    }
}
