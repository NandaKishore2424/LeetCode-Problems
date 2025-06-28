class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st=new HashSet<>();
        int left=0, max=0;
        for(int right=0;right<s.length();right++){
            while(st.contains(s.charAt(right))){
                st.remove(s.charAt(left));
                left++;
            }
            st.add(s.charAt(right));
            max=Math.max(max, right-left+1);
        }
        return max;
    }
}