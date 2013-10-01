public class Solution {
    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(num==null) return 0;
        qsort(num,0,num.length-1);
        int res = 0;
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<num.length-2;i++){
            int first = num[i];
            int sum2 = getTwoSum(num,first,i+1,target);
            int diff = (sum2+first>target?(sum2+first-target):(target-(sum2+first)));
            if(diff<minDiff) {
                minDiff=diff;
                res = sum2+first;
            }
        }
        
        return res;
        
    }
    
     private int getTwoSum(int[] num,int first,int start,int target){
        int i=start,j=num.length-1;
        int targetSum = target-first;
        int diff = Integer.MAX_VALUE;
        int res = 0;
        while(i<j){
            int sum = num[i]+num[j];
            if(sum==targetSum){
                diff=0;
            	res = sum;
            	break;
            }else if(sum>targetSum){
                if(sum-targetSum<diff) {
                    diff = sum-targetSum;
                    res = sum;
                }
                j--;
            }else if(sum<targetSum){
                if(targetSum-sum<diff) {
                    diff = targetSum -sum;
                    res = sum;
                }
                i++;
            }
        }
        return res;
    }
    
    private void qsort(int[] arr,int l,int r){
       if(l>=r) return;
       int value,start,end;
       start=l;
       end=r;
       value=arr[start];
       
       while(start<end){
           while(start<end){
               if(arr[end]<value){
                   arr[start++]=arr[end];
                   break;
               }else end--;
           }
           
           while(start<end){
               if(arr[start]>value){
                   arr[end--]=arr[start];
                   break;
               }else start++;
           }
       }
       
       arr[start]=value;
       qsort(arr,l,start-1);
       qsort(arr,start+1,r);
    }
}
