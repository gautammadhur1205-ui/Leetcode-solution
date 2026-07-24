class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y=0;int a=x;
        while(a!=0){
            y=10*y+a%10;
            a/=10;
        }
        return (y==x);


        
    }
}