class Solution {
    public int minSubArrayLen(int k, int[] arr) {
         int l=0;
        int r=0;
        int sum=0;
        int minlen=Integer.MAX_VALUE;
        while(r<arr.length){
            sum+=arr[r];
            while(sum>=k){
                minlen=Math.min(minlen,r-l+1);
                sum-=arr[l];
                l++;
            }
            r++;
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
        
    }
}