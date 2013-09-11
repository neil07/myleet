public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices==null||prices.length<=1) return 0;
        int minNum = prices[0];
        int maxNum = prices[0];
        int profitsum = 0;
        int curprofit = 0;
        
        for(int i=1;i<prices.length;i++){
            int price = prices[i];
            if(price<maxNum) {
                profitsum+=curprofit;
                minNum = price;
                maxNum = price;
                curprofit = 0;
            }
            else if(price>maxNum){
                if(price-minNum>curprofit){
                    maxNum=price;
                    curprofit = maxNum-minNum;
                }
            }
        }
        if(curprofit>0) profitsum += curprofit;
        
        return profitsum;
    }
}
