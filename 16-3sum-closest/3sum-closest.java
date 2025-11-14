class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int closestdiff=Integer.MAX_VALUE;
        int closestsum=0;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                int currdiff=Math.abs(sum-target);
                if(currdiff < closestdiff){
                    closestdiff=currdiff;
                    closestsum=sum;
                }
                if(sum==target){
                    return closestsum;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return closestsum;
    }
}