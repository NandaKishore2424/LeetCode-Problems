class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0;
        long totalcost=0;
        int maxfreq=1;

        //expand
        for(int right=1;right<nums.length;right++){
            totalcost+=(long)(nums[right]-nums[right-1])*(right-left);
        while(totalcost>k){
            totalcost-=(long)(nums[right]-nums[left]);
            left++;
        }
        maxfreq=Math.max(maxfreq, right-left+1);
        }
        return maxfreq;
    }
}