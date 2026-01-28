class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0], nums[1]);
        int val1=nums[0];
        int val2=Math.max(nums[1], nums[0]);
        for(int i=2;i<nums.length;i++){
            int curr = Math.max(val2, val1 + nums[i]);
            val1=val2;
            val2=curr;
        }
        return val2;
    }
}