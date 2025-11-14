class Solution {
    public int compress(char[] chars) {
        int slow=0,fast=0;
        while(fast<chars.length){
            int start=fast; //we mark where the group starts
            while(fast < chars.length && chars[fast]==chars[start]){
                fast++; //fast moves until it finds a new character the above while checks if the element at the fast is same as the character at the start --- 
            }
            int count= fast-start; // we can calculate the occurence just by subtracting
            chars[slow++]=chars[start]; //store the character in the place 
            if(count>1){
                for(char c: String.valueOf(count).toCharArray()){
                    chars[slow++]=c;
                }
            }
        }
        return slow;
    }
}