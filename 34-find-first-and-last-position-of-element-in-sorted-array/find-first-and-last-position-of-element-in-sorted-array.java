class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{find(nums, target, true),find(nums, target, false)};
    }
    private static int find(int[] nums, int target, boolean start){
        int left=0, right=nums.length-1, res=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                res=mid;
                if(start){
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return res;
    }
}