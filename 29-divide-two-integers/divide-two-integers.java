class Solution {
    public int divide(int a, int b) {
         if (a == Integer.MIN_VALUE && b == -1) {
            return Integer.MAX_VALUE;
        }
       int result= a/b;
       return result;
    }
    
}