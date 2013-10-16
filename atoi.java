public class Solution {
    public int atoi(String str) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(str==null) return 0;
        str = str.trim();
        if(str.length()==0) return 0;
        boolean isPositive = true;
        if(str.charAt(0)=='-') {
            isPositive = false;
            str = str.substring(1);
        }else if(str.charAt(0)=='+'){
            str = str.substring(1);
        }
        if(str.length()==0) return 0;
        
        int i=0;
        boolean hasIllegal = false;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)>'9'||str.charAt(i)<'0') {
                hasIllegal = true;
                break;
            }
        }
        if(i==0) return 0;
        if(hasIllegal) str = str.substring(0,i);
        
        return (int)atoiCore(str,isPositive);
    }
	
	 private long atoiCore(String str,boolean isPositive){
        long res = 0;
        int len = str.length();
        int j=0;
        int flag = isPositive?1:-1;
        for(int i=len-1;i>=0;i--){
            res = res + flag*(int)((str.charAt(i)-'0')*Math.pow(10,j++));
            if(res>2147483647&&isPositive){
                res = 2147483647;
                break;
            }else if(res<-2147483648&&(!isPositive)){
                res = -2147483648;
                break;
            }
        }
        
        return res;
	}
}
