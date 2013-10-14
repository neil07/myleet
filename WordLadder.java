public class Solution {
    public int ladderLength(String start, String end, HashSet<String> dict) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        
        Queue<String> queue = new LinkedList<String>();
        queue.add(start);
        Queue<Integer> lenQueue = new LinkedList<Integer>();
        lenQueue.add(1);
        HashSet<String> finished = new HashSet<String>();
        
        int length = 0;
        while(!queue.isEmpty()){
            String target = queue.poll();
            int len = lenQueue.poll();
            if(isAjacent(target,end)){
                length = len+1;
                break;
            }
            
            for(int i=0;i<target.length();i++){
                for(char ch='a';ch<='z';ch++){
                    if(ch==target.charAt(i)) continue;
                    
                    char[] arr = target.toCharArray();
                    arr[i]=ch;
                    String str = String.valueOf(arr);
                    if(dict.contains(str)){
                         queue.add(str);
                         lenQueue.add(len+1);
                         dict.remove(str);
                    }
                }
            }
        }
        
        return length;
        
        
    }
    
    private boolean isAjacent(String a,String b){
        int len = a.length();
        int diff = 0;
        for(int i=0;i<len;i++){
            if(a.charAt(i)!=b.charAt(i)){
                diff++;
            }
        }
        if(diff==1) return true;
        else return false;
    }
}
