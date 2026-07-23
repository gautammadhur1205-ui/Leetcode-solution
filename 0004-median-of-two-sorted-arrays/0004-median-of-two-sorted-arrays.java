class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        if(num1.length>num2.length){
            return findMedianSortedArrays(num2,num1);
        }
        int low=0,n1=num1.length,n2=num2.length,high=n1;
        while(low<=high){
            int cut1=(low+high)/2;
            int cut2=(n1+n2+1)/2-cut1;
            int left1=(cut1==0)?Integer.MIN_VALUE:num1[cut1-1];
            int left2=(cut2==0)?Integer.MIN_VALUE:num2[cut2-1];
            int right1=(cut1==n1)?Integer.MAX_VALUE:num1[cut1];
            int right2=(cut2==n2)?Integer.MAX_VALUE:num2[cut2];
            if(left1<=right2 && left2<=right1){
                if((n1+n2)%2==0){
                    return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;
                }else{
                    return Math.max(left1,left2);
                }
            }else if(left1>right2){
                high=cut1-1;
            }else{
                low=cut1+1;
            }

        }
        return 0.0;

    }
        
}
