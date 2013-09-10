public class Solution {
    public int longestConsecutive(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(num==null) return 0;
        
        HashMap <Integer,Integer> mapArr = new HashMap<Integer,Integer>();
        HashMap <Integer,Integer> visitedArr = new HashMap<Integer,Integer>();
        
        for(int i=0;i<num.length;i++){
            mapArr.put(num[i],1);
        }
        
        int longest = 0;
        for(int j=0;j<num.length;j++){
            int tmpint = num[j];
            if(visitedArr.get(tmpint)!=null) continue;
            else{
                int length=1;
                visitedArr.put(tmpint,1);
                int upnum = tmpint+1;
                while(mapArr.get(upnum)!=null){
                    length++;
                    if(visitedArr.get(upnum)==null){
                        visitedArr.put(upnum,1);
                    }
                    upnum++;
                }
                int downnum = tmpint-1;
                while(mapArr.get(downnum)!=null){
                    length++;
                    if(visitedArr.get(downnum)==null){
                        visitedArr.put(downnum,1);
                    }
                    downnum--;
                }
                if(length>longest) longest = length;
            }
        }
        
        return longest;
    }
}
