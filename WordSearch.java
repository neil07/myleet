public class Solution {
    public boolean exist(char[][] board, String word) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
		int m = board.length;
        if(m<=0) return false;
		int n = board[0].length;
		if(n<=0) return false;
		if(word.length()<=0) return true;
		boolean[][] visited=new boolean[m][n];
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(traverse(board,i,j,visited,word,0)) return true;
			}
		}
		return false;
    }
	
	private boolean traverse(char[][]board,int i,int j,boolean[][]visited,String word,int cursor){
		if(cursor==word.length()) return true;
		if(i<0||i>=board.length) return false;
    	if(j<0||j>=board[0].length) return false;
		if(visited[i][j]) return false;
		if(word.charAt(cursor)==board[i][j]){
			visited[i][j]=true;
			if(traverse(board,i-1,j,visited,word,cursor+1)) return true;
			if(traverse(board,i,j-1,visited,word,cursor+1)) return true;
			if(traverse(board,i+1,j,visited,word,cursor+1)) return true;
			if(traverse(board,i,j+1,visited,word,cursor+1)) return true;
			visited[i][j]=false;
		}
		return false;
	}
}
