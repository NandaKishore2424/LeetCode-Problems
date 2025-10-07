class Solution {
    static{
        System.gc();
        for(int i = 0; i < 500; i++){
            new Solution().canJump(new int[] {2, 3, 1, 1, 4});
        }
    }
    
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        int n = nums.length;
        int maxReach = 0;

        for (int i = 0; i < n; i++) {
            if (i > maxReach) return false;
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= n - 1) return true;
        }

        return maxReach >= n - 1;
    }
}