class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxsum=nums[0],currsum=nums[0];
        for(int i=1;i<n;i++){
            if(currsum+nums[i]<nums[i]){
                currsum=nums[i];
            }
            else
            {
                currsum+=nums[i];
            }
            if(currsum>maxsum){
                maxsum=currsum;
            }
        }
        return maxsum;
    }
}