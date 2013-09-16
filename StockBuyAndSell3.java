public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices==null||prices.length<=1) return 0;
        int len = prices.length;
        int[] profitHead = new int[len];
        int[] profitTail = new int[len+1];
        
        maxProfitCoreHead(prices,profitHead);
        profitTail[len]=0;
        maxProfitCoreTail(prices,profitTail);
        
        int maxProfit=0;
        for(int i=0;i<len;i++){
            if(profitTail[i+1]+profitHead[i]>maxProfit)
                maxProfit = profitTail[i]+profitHead[i];
        }
        return maxProfit;
    }
    
     public void maxProfitCoreHead(int[] prices,int[] profitArr) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices==null||prices.length<=1) return;
        int minNum = prices[0];
        int maxNum = prices[0];
        int profit = 0;
        profitArr[0]=0;
        
        for(int i=1;i<prices.length;i++){
            int price = prices[i];
            profitArr[i] = profit;
            if(price<minNum) {
                minNum = price;
                maxNum = price;
            }
            else if(price>maxNum){
                if(price-minNum>profit){
                    maxNum=price;
                    profit = maxNum-minNum;
                    profitArr[i] = profit;
                }
            }
        }
    }
    
     public void maxProfitCoreTail(int[] prices,int[] profitArr) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices==null||prices.length<=1) return;
        int minNum = prices[prices.length-1];
        int maxNum = prices[prices.length-1];
        int profit = 0;
        profitArr[prices.length-1]=0;
        for(int i=prices.length-2;i>=0;i--){
            int price = prices[i];
            profitArr[i] = profit;
            if(price>maxNum) {
                minNum = price;
                maxNum = price;
            }
            else if(price<minNum){
                if(maxNum-price>profit){
                    minNum=price;
                    profit = maxNum-minNum;
                    profitArr[i] = profit;
                }
            }
        }
    }
}
