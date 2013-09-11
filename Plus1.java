public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int carry=0;
        int[] res = null;
        for(int i=digits.length-1;i>=0;i--){
            int num = digits[i];
            if(i==digits.length-1) num=num+1;
            num+=carry;
            
            if(num>=10){
                carry=1;
                digits[i]=num-10;
                if(i==0){
                    res = new int[digits.length+1];
                    res[0]=1;
                    for(int j=1;j<res.length;j++){
                        res[j]=digits[j-1];
                    }
                }
            }else{
                digits[i]=num;
                break;
            }
            
        }
        
        if(res!=null) return res;
        else return digits;
    }
}
