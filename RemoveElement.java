public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A==null) return 0;
        else if(A.length==0) return 0;
        int oriLen = A.length;
        int i=0;
        int j=oriLen-1;
        
        for(i=0;i<oriLen;i++){
            if(A[i]==elem) {
                while(j>=0&&A[j]==elem){
                    j--;
                }
                if(j>i){
                    A[i]= A[j];
                    j--;
                }else break;
                
            }
        }
        return j+1;
    }
}
