class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        for(int k=j;k>=0;k--){
            if(i>j){
                break;
            }else{
                int left=nums[i]*nums[i];
                int right=nums[j]*nums[j];
                if(left>=right){
                    ans[k]=left;
                    i++;
                }else{
                    ans[k]=right;
                    j--;
                }
            }
        }
        return ans;
    }
}