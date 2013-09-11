public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices==null||prices.length<=1) return 0;
        int minNum = prices[0];
        int maxNum = prices[0];
        int profit = 0;
        
        for(int i=1;i<prices.length;i++){
            int price = prices[i];
            if(price<minNum) {
                minNum = price;
                maxNum = price;
            }
            else if(price>maxNum){
                if(price-minNum>profit){
                    maxNum=price;
                    profit = maxNum-minNum;
                }
            }
        }
        
        return profit;
    }
}
