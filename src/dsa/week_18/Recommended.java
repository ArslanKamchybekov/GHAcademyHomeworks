package dsa.week_18;


class Solution {
    public int trap(int[] heights) {
        int res = 0;

        int[] maxLeft = new int[heights.length];
        maxLeft[0] = heights[0];
        for(int i = 1; i < heights.length; i++) maxLeft[i] = Math.max(heights[i], maxLeft[i - 1]);

        int[] maxRight = new int[heights.length];
        maxRight[heights.length - 1] = heights[heights.length - 1];
        for(int i = heights.length - 2; i >= 0; i--) maxRight[i] = Math.max(heights[i], maxRight[i + 1]);

        for(int i = 0; i < heights.length; i++){
            int minHeight = Math.min(maxLeft[i], maxRight[i]);
            res += Math.max(0, minHeight - heights[i]);
        }

        return res;
    }
}