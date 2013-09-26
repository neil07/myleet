public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> prevArr = new ArrayList<Integer>();
        prevArr.add(1);
        ArrayList<Integer> nowArr = new ArrayList<Integer>();
        
        for(int i=0;i<=rowIndex;i++){
            nowArr = new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                if(j==0){
                    nowArr.add(prevArr.get(0));
                }else if(j==i){
                    nowArr.add(prevArr.get(j-1));
                }else{
                    int value = prevArr.get(j-1)+prevArr.get(j);
                    nowArr.add(value);
                }
            }
            prevArr = nowArr;
        }
        
        return nowArr;
    }
}
