class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:words){
            StringBuilder sb=new StringBuilder(word);
            sb.reverse();
            String reversedWord=sb.toString();
            result.append(reversedWord);
            result.append(" ");
        }
        return result.toString().trim();
    }
}