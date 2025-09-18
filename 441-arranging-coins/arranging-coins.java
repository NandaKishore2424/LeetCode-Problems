class Solution {
    public int arrangeCoins(int n) {
        int carry =(int) Math.sqrt(8L*n + 1) ; 
        int sol =  (-1 + carry)/2;
        return sol; 
    }
}