class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int l=0;
        int r=k-1;
        double sum=0;
        for(int i=l;i<=r;i++){
            sum+=arr[i];
        }
        double window=sum/(float)k;
        while(r<arr.length-1)
            {
            sum-=arr[l];
            l++;
            r++;
            sum+=arr[r];
            
            window=Math.max(sum/(float)k,window);
        }
        return window;
    }
}