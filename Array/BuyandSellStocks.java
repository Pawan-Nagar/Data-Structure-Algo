import java.util.*;

public class BuyandSellStocks {
    
    public static int buyANDsellSTOCKS( int prices[] ){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;
    
        for(int i=0; i<prices.length; i++){
           if(buyprice < prices[i]){
           int profit = prices[i] - buyprice;
           maxProfit = Math.max(maxProfit, profit);  
        }
        else{
            buyprice = prices[i];
        }
        }
        return maxProfit;
    }

    public static void main( String[] args){
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        System.out.print(buyANDsellSTOCKS(prices));
    }
}
