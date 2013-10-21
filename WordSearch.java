public class Solution {
     int[][] actionArr;
    public boolean exist(char[][] board, String word) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(word==null||board==null) return false;
        else if(word.length()<=0) return true;
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited=new boolean[m][n];
        actionArr = new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(traverse(board,i,j,visited,word,0)) return true;
            }
        }
        return false;
    }
    
     private boolean traverse(char[][]board,int i,int j,boolean[][]visited,String word,int cursor){
        if(cursor==word.length()) return true;
        if(i<0||i>=board.length)  return false;
        if(j<0||j>=board[0].length) return false;
        if(visited[i][j]) return false;
        if(word.charAt(cursor)==board[i][j]){
            visited[i][j]=true;
            for(int k=0;k<4;k++){
                if(traverse(board,i+actionArr[k][0],j+actionArr[k][1],visited,word,cursor+1)) return true;    
            }
            visited[i][j]=false;
        }
        return false;
    }
}
