public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A==null) return 0;
        if(A.length==0) return 0;
        int offset = 0;
        int currentNum = A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]==currentNum){
                offset++;
            }else{
                currentNum = A[i];
                if(offset<i) A[i-offset]=A[i];
            }
            
        }
        return A.length-offset;
    }
}
