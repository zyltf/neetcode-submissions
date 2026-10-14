class Solution {
    public int maxArea(int[] heights) {
        int l=0, r=heights.length-1, max=0;

        while(l<r){
            if (heights[l] > heights[r]){
                max = Math.max(heights[r]*(r-l), max);
                r--;
            } else {
                max = Math.max(heights[l]*(r-l), max);
                l++;
            }
        }

        return max;
    }
}
