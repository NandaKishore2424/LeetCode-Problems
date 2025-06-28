class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(i);
            }
            else if(ch==')'){
                if(!st.isEmpty()){
                    st.pop();
                }
                else
                {
                    str.deleteCharAt(i);
                    i--;
                }
            }
        }
        while(!st.isEmpty()){
            str.deleteCharAt(st.pop());
        }
        return str.toString();
    }
}