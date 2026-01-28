class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int val1 = cost[0];
        int val2 = cost[1];
        for(int i=2;i<cost.length;i++){
            int curr=Math.min(val1, val2) + cost[i];
            val1=val2;
            val2=curr;
        }
        return Math.min(val1, val2);
    }
}