public class Solution {
    
    ArrayList<ArrayList<Integer>> res=null;
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
       res = new ArrayList<ArrayList<Integer>>();
       permuteCore(num,0);
       return res; 
    }
    
    public void permuteCore(int[] num,int begin){
        if(num==null) return;
        if(begin==num.length){
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i=0;i<num.length;i++){
                arr.add(num[i]);
            }
            res.add(arr);
        }
        else{
            for(int i=begin;i<num.length;++i){
                if(i!=begin){
                    int tmp = num[begin];
                    num[begin]= num[i];
                    num[i]=tmp;    
                }
                
                
                permuteCore(num,begin+1);
                
                if(i!=begin){
                    int tmp = num[i];
                    num[i]=num[begin];
                    num[begin]=tmp;    
                }
                
            }
        }
    }
}
