class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Deque<int[]> stack = new ArrayDeque<>(); 
    
        for (int i=0; i<n; i++){
            int t = temperatures[i];
            while (!stack.isEmpty() && t > stack.peek()[0]){
                res[stack.peek()[1]] = i-stack.pop()[1];
            }
            stack.push(new int[]{t, i});
        }

        return res;
    }
}
