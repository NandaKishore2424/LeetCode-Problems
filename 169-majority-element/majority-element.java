class Solution {
    public int majorityElement(int[] nums) {
        int can=0,count=0;
        for(int num:nums){
            if(count==0){
                can=num;
            }
            count+=(num==can)? 1: -1;
        }
        return can;
    }
}