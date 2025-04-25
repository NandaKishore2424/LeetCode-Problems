class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;

        HashSet<Integer> numSet=new HashSet<Integer>();
        for(int num:nums){
            numSet.add(num);
        }
        int maxLength=0;
        for(int num:numSet){
            if(!numSet.contains(num-1)){
                int currLength=1;

                while(numSet.contains(num+currLength)){
                    currLength++;
                }
                maxLength=Math.max(maxLength, currLength);
            }
        }
        return maxLength;
    }
}