class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n < 3) return 0;

        
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];

        for (int i=1; i<n; i++){
            leftMax[i] = height[i]>leftMax[i-1] ? height[i] : leftMax[i-1];
            rightMax[n-i-1] = height[n-i-1]>rightMax[n-i] ? height[n-i-1] : rightMax[n-i];
        }

        int res=0;
        for (int i=1; i<n; i++){
            res += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        
        return res;
    }
}
