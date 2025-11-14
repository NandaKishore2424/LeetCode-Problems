class Solution {
    public int removeDuplicates(int[] nums) {
        int left=1;
        int count=1;
        for(int right=1;right<nums.length;right++){
            if(nums[right]!=nums[right-1]){
                nums[left]=nums[right];
                left++;
                count++;
            }
        }
        return count;
    }
}