class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
        }
        int actualnum=(n*(n+1))/2;
        int missingnum=actualnum-sum;
        return missingnum;
        
    }
}