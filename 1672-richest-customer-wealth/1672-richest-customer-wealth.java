class Solution {
    public int maximumWealth(int[][] account) {
      int ans=Integer.MIN_VALUE;
      for (int person=0;person< account.length ;person++ ){
        int rowsum=0;
        for (int wealth=0;wealth<account[person].length ;wealth++ ){
          rowsum+= account[person][wealth];
        
        } 
        if(ans<rowsum){
          ans=rowsum;
        }
      }return ans;
    }
    
}
