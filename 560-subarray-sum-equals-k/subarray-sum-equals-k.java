class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> pcount=new HashMap<>();
        pcount.put(0,1);
        int count=0;
        int prefixsum=0;
        for(int num:nums){
            prefixsum+=num;
            if(pcount.containsKey(prefixsum-k)){
                count+=pcount.get(prefixsum-k);
            }
            pcount.put(prefixsum, pcount.getOrDefault(prefixsum, 0)+1);
        }
        return count;
    }
}