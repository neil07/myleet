public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(numbers==null) return null;
        if(numbers.length<2) return null;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target)
                    return new int[]{i+1,j+1};
            }
        }
        return null;
    }
}
