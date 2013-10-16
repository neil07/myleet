public class Solution {
    public int climbStairs(int n) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(n==1) return 1;
        else if(n==2) return 2;
        
        int num1 = 1;
        int num2 = 2;
        int res = 0;
        for(int i=2;i<n;i++){
            res = num1+num2;
            num1 = num2;
            num2 = res;
        }
        
        return res;
    }
}
