class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;

        int maxArea = 0;
        int currArea = 0;
        int minHeight = 0;
        int l = 0;
        int r = height.length-1;

        while(l<r){
            minHeight = Math.min(height[l], height[r]);
            currArea = minHeight * (r-l);
            maxArea = Math.max(maxArea, currArea);

            while(height[l] <= minHeight && l<r)
                l++;
            while(height[r] <= minHeight && l<r)
                r--;
        }
        return maxArea;
    }
}