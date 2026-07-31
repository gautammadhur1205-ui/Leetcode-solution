class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int res=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left=i+1,right=nums.length-1;
            while(left<right){
                sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum)<Math.abs(target-res)){
                    res=sum;
                }
                if(sum==target) return target;
                if(sum<target){ left++;
                }else{ right--;}
            }

        }return res;
    }
}