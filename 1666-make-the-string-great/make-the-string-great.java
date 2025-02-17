class Solution {
    public String makeGood(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = stack.length();
            if (len > 0 && Math.abs(stack.charAt(len - 1) - c) == 32) {
                stack.deleteCharAt(len - 1); // Remove the bad pair
            } else {
                stack.append(c); // Push the character onto the stack
            }
        }
        
        return stack.toString();
    }
}