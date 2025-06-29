class Solution {
    public boolean isNumber(String S) {
        boolean num=false, dec=false, sign=false, exp=false;
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(Character.isDigit(c)){
                num=true;
            }
            else if (c=='e'||c=='E'){
                if(exp || !num) return false;
                exp=true;
                sign=false;
                dec=false;
                num=false;
            }
            else if(c=='+'||c=='-'){
                if(sign || num || dec) return false;
                sign=true;
            }
            else if(c=='.'){
                if(dec || exp) return false;
                dec=true;
            }
            else{
                return false;
            }
        }
        return num;
    }
}