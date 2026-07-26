import java.util.*;
class Solution {
    public String longestNiceSubstring(String s) {
       String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(isnice(sub) && sub.length()>ans.length()){
                    ans=sub;
                }

            }
            
        }return ans;
    }
    static boolean isnice(String s){
        HashSet<Character> set=new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        for(char ch:s.toCharArray()){
            if(Character.isLowerCase(ch)){
                if(!set.contains(Character.toUpperCase(ch))){
                    return false;}
            }else{
                    if(!set.contains(Character.toLowerCase(ch))){
                        return false;
                    }
                }


        }return true;
    }
      
}