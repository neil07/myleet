public class Solution {
    public int minPathSum(int[][] grid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(grid==null||grid.length<=0) return 0;
        if(grid[0].length<=0) return 0;
        int rowLen = grid.length;
        int colLen = grid[0].length;
        int minimum = grid[0][0];
        int[][] lengthArr = new int[rowLen][colLen];
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                if(i==0&&j==0) lengthArr[i][j]=grid[i][j];
                else if(i==0){
                    lengthArr[i][j]=lengthArr[i][j-1]+grid[i][j];
                }else if(j==0){
                    lengthArr[i][j]=lengthArr[i-1][j]+grid[i][j];
                }else{
                    int min = Math.min(lengthArr[i-1][j],lengthArr[i][j-1]);
                    lengthArr[i][j]=min+grid[i][j];
                }
            }
        }
        return lengthArr[rowLen-1][colLen-1];
    }
}
