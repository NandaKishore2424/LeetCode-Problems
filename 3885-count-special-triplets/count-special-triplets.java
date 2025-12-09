class Solution {
    public int specialTriplets(int[] nums) {
        final long MOD = 1_000_000_007;
        Map<Integer, Integer> right = new HashMap<>();
        Map<Integer, Integer> left = new HashMap<>();

        for (int x : nums) {
            right.put(x, right.getOrDefault(x, 0) + 1);
        }

        long ans = 0;

        for (int j = 0; j < nums.length; j++) {
            int mid = nums[j];
            right.put(mid, right.get(mid) - 1);

            int target = mid * 2;

            long leftCount = left.getOrDefault(target, 0);
            long rightCount = right.getOrDefault(target, 0);

            ans = (ans + (leftCount * rightCount) % MOD) % MOD;

            left.put(mid, left.getOrDefault(mid, 0) + 1);
        }

        return (int) ans;
    }
}