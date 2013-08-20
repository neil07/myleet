public class Solution {
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        List<Integer> digitArr=new ArrayList<Integer>();
        while(true){
            int a = x%10;
            digitArr.add(a);
            x = x/10;
            if(x==0) break;
        }
        
        int res = 0;
        int len = digitArr.size();
        for(int i=0;i<len;i++){
            res += digitArr.get(i) * Math.pow(10,len-1-i);
        }
        
        if(x>=0) return res;
        else return 0-res;
        
    }
}
