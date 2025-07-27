public class Stocks {
    public static void Profit(int Sell_prices[]){
         int max_profit = 0;
         int buy = Integer.MAX_VALUE;
         for ( int i = 0;i<Sell_prices.length;i++){
            if(buy<Sell_prices[i]){
                int profit = Sell_prices[i]-buy;
                max_profit = Math.max(max_profit, profit);
            } else {
                buy = Sell_prices[i];
            }

         }
         System.out.println("Max Profit: " + max_profit);
    }
    public static void main(String[] args) {
        int Sell_prices[] = { 7, 1, 5, 3, 6, 4 ,10 };
        Profit(Sell_prices);
        
    }
    
}