class Solution {
    public int removeElement(int[] num, int val) {
        if(num.length<0){
            return 0;
        }
        int i=0;
        for(int j=0;j<num.length;j++){
            if(num[j]!=val){
                num[i]=num[j];
                i++;
            }
        }return i;
        
    }
}