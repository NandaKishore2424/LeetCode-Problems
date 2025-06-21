class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) return n;
        
        int max = 0;

        for (int i = 0; i < n; i++) {
            Map<String, Integer> slopeMap = new HashMap<>();
            int same = 1; // same point count
            int localMax = 0;

            for (int j = i + 1; j < n; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                if (dx == 0 && dy == 0) {
                    same++; // duplicate point
                } else {
                    int gcd = gcd(dy, dx);
                    dy /= gcd;
                    dx /= gcd;

                    // Handle negative slope uniformly
                    if (dx < 0) {
                        dx = -dx;
                        dy = -dy;
                    }

                    String slope = dy + "/" + dx;
                    slopeMap.put(slope, slopeMap.getOrDefault(slope, 0) + 1);
                    localMax = Math.max(localMax, slopeMap.get(slope));
                }
            }

            max = Math.max(max, localMax + same);
        }

        return max;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
