/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        
        ArrayList<Interval> res = new ArrayList<Interval>();
        if(intervals==null) {
            if(newInterval==null) return null;
            res.add(newInterval);
            return res;
        }else if(newInterval==null) return intervals;
        
        Interval[] arr=new Interval[intervals.size()+1];
        intervals.toArray(arr);
        arr[intervals.size()]=newInterval;
        
        int p= intervals.size()-1;
        while(p>=0){
            if(intervals.get(p).start<=newInterval.start) break;
            arr[p+1]=arr[p];
            p--;
        }
        arr[p+1]=newInterval;
        
        
        Interval previous=arr[0];
        for(int i=1;i<arr.length;i++){
            Interval inter = arr[i];
            
            if(previous.end>=inter.start){
                previous.end = Math.max(inter.end,previous.end);
            }else {
                res.add(previous);
                previous = inter;
            }
        }
        res.add(previous);
        return res;
    }
}
