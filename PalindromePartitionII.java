public class Solution {

    boolean[][] palinArr;  
    public int minCut(String s) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(s==null) return 0;
        int n = s.length();
        if(n<=0) return 0;
        palinArr = new boolean [n][n];
        int[] mincut = new int[n];
        char[] arr = s.toCharArray();
        mincut[0]=0;
        
        for(int i=1;i<n;i++){
            mincut[i]=mincut[i-1]+1;
            for(int j=i-1;j>=0;j--){
                if(isPalindrome(s,j,i)){
                    if(j==0) mincut[i]=0;
                    else mincut[i]=Math.min(mincut[i],mincut[j-1]+1);
                }
            }
        }
        return mincut[n-1];
    }
    
    private boolean isPalindrome(String s,int i,int j){
        if(palinArr[i][j]) return true;
        else{
            if(s.charAt(i)==s.charAt(j) && (j-i<=2||palinArr[i+1][j-1])){
                palinArr[i][j]=true;
                return true;
            }
        }
        return false;
    }
}
