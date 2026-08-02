class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
        return comb("",digits);
    }
    static ArrayList<String> comb(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        int start=(digit-2)*3;
        int end=((digit-1)*3);
        if(digit>7) start+=1;
        if(digit==7||digit==8)end+=1;
        if(digit==9)end+=2;
        ArrayList<String> list=new ArrayList<>();
        for(int i=start;i<end;i++){
            char ch=(char)('a'+i);
            list.addAll(comb(p+ch,up.substring(1)));
        }
        return list;
    }
}