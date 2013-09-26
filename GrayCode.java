public class Solution {
    public ArrayList<Integer> grayCode(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(n<0) return res;
        else if(n==0) {
            res.add(0);
            return res;
        }
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=0;
        res.add(0);
        
        for(int i=1;i<Math.pow(2,n);i++){
            getNext(arr,res);
            res.add(getNumFromBitArr(arr));
        }
        
        return res;
        
    }
    
    public void getNext(int[] arr,ArrayList<Integer> resArr){
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=1-arr[i];
            int num = getNumFromBitArr(arr);
            if(!resArr.contains(new Integer(num))) break;
            else arr[i]=1-arr[i];
        }
    }
    
    public int getNumFromBitArr(int[] arr){
        int res = 0;
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>0) res += 1<<j;
            j++;
        }
        
        return res;
    }
}
