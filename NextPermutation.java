public class Solution {
    public void nextPermutation(int[] num) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(num==null||num.length<=1) return;
        int len = num.length;
        int m = len-2;
        while(m>=0){
            if(num[m]<num[m+1]) break;
            m--;
        }
        
        //should reverse
        if(m<0){
        	int i=0,j=len-1;
        	while(i<=j){
        		swap(num,i,j);
        		i++;
        		j--;
        	}
        	return;
        }
        
        int n = m+1;
        for(int i=m+2;i<len;i++){
            if(num[i]>num[m]){
                if(num[i]<num[n]){
                    n=i;
                }
            }
        }
        swap(num,m,n);
        if(m+1<len) qsort(num,m+1,len-1);
    }
    
    private void qsort(int[] a,int l,int r){
    	if(l>r) return;
        if(l<0||l>=a.length) return;
        if(r<0||r>=a.length) return;
        
        int start = l;
        int end = r;
        int val = a[start];
        
        while(start<end){
            while(start<end){
                if(a[end]<val){
                    a[start++]=a[end];
                    break;
                }else end--;
            }
            
            while(start<end){
                if(a[start]>val){
                    a[end--]=a[start];
                    break;
                }else start++;
            }
        }
        
        a[start]=val;
        qsort(a,l,start-1);
        qsort(a,start+1,r);
    }
    
    
    private void swap(int[]a,int i,int j){
        int tmp = a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
    
}
