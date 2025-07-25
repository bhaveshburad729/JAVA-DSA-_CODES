public class Stocks {
    public static void Profit(int prices[]){
         int max_profit = 0;
         int buy = Integer.MAX_VALUE;
         for ( int i = 0;i<prices.length;i++){
            if(buy<prices[i]){
                int profit = prices[i]-buy;
                max_profit = Math.max(max_profit, profit);
            } else {
                buy = prices[i];
            }

         }
         System.out.println("Max Profit: " + max_profit);
    }
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 ,10 };
        Profit(prices);
        
    }
    
}