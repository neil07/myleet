public class Solution {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(haystack==null) return null;
        else if(needle==null) return null;
        
        int len = haystack.length();
        int lenNeedle = needle.length();
        if(lenNeedle>len) return null;
        
        int[] next = new int[len];
        boolean res = false;
        int i=0,j=0;
        for( i=0;i<=len-lenNeedle;i++){
            for(j=0;j<lenNeedle;j++){
                if(i+j>=len) break;
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }                
            }
            if(j==lenNeedle){
                res = true;
                break;
            }
        }
        if(i==0&&j==0) res = true;
        if(res) return haystack.substring(i);
        else return null;
    }
}
