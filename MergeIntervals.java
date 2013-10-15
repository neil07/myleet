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
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(intervals==null||intervals.size()<=1) return intervals;
        Interval[] arr=new Interval[intervals.size()];
        intervals.toArray(arr);
        qsort(arr,0,arr.length-1);
        ArrayList<Interval> res = new ArrayList<Interval>();
        
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
    
    private void qsort(Interval[] arr,int l,int r){
        if(l>=r) return;
        int start = l;
        int end = r;
        Interval inteval = arr[start];
        int val = inteval.start;
        
        
        while(start<end){
            while(start<end){
                if(arr[end].start<val){
                    arr[start++]=arr[end];
                    break;
                }
                else end--;
            }
            
            while(start<end){
                if(arr[start].start>val){
                    arr[end--]=arr[start];
                    break;
                }else start++;
            }
        }
        
        arr[start]=inteval;
        qsort(arr,l,start-1);
        qsort(arr,start+1,r);
    }
}
