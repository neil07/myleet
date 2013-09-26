public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(triangle==null) return 0;
        else if(triangle.size()<=0) return 0;
        else if(triangle.get(0).size()<=0) return 0;
        int rowLen = triangle.size();
        int colLen = triangle.get(triangle.size()-1).size();
        int[][] pathSumArr = new int[rowLen][colLen];
        pathSumArr[0][0]=triangle.get(0).get(0);
        
        for(int i=1;i<rowLen;i++){
            ArrayList<Integer> arr = triangle.get(i);
            for(int j=0;j<arr.size();j++){
                int currentNum = arr.get(j);
                if(j==0){
                    pathSumArr[i][j]=pathSumArr[i-1][0]+currentNum;
                }else if(j==arr.size()-1){
                    pathSumArr[i][j]=pathSumArr[i-1][j-1]+currentNum;
                }else{
                    int tmp = Math.min(pathSumArr[i-1][j-1],pathSumArr[i-1][j]);
                    pathSumArr[i][j] = tmp + currentNum;
                }
            }
        }
        
        int minRes = Integer.MAX_VALUE;
        for(int i=0;i<colLen;i++){
            if(pathSumArr[rowLen-1][i]<minRes) minRes = pathSumArr[rowLen-1][i];
        }
        
        return minRes;
    }
}
