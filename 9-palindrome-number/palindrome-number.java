class Solution {
    public boolean isPalindrome(int x) {
        long sum=0;
        int x1=x;
        if(x<0)
        {
            return false;
        }
        while(x!=0)
        {
            int r=x%10;
            sum=(sum*10)+r;
            x/=10;
        }
        if(x1==(int)sum)
        {
            return true;
        }
        else
        return false;
    }
}