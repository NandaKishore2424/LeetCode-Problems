class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        for(int num:nums){
            if(num>0){
                seen.add(num);
            }
        }
        return seen.size();
    }
}