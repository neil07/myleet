public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
        if(numRows==0) return triangle;
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        triangle.add(arr);
        
        for(int i=1;i<numRows;i++){
            arr = new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                if(j==0){
                    int value = triangle.get(i-1).get(0);
                    arr.add(value);
                }else if(j==i){
                    int value = triangle.get(i-1).get(j-1);
                    arr.add(value);
                }else{
                    int value = triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j);
                    arr.add(value);
                }
            }
            triangle.add(arr);
        }
        
        return triangle;
    }
}
