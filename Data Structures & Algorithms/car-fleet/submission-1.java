class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Integer[] indices = new Integer[n];
        Deque<Double> stack = new ArrayDeque<>();

        for (int i=0; i<n; i++){
            indices[i] = i;
        }

        Arrays.sort(indices, (i,j) -> Integer.compare(position[i], position[j]));
        
        int[] sPosition = new int[n];
        int[] sSpeed = new int[n];
        double[] sTime = new double[n];

        for (int i=0; i<n; i++){
            sPosition[i] = position[indices[i]];
            sSpeed[i] = speed[indices[i]];
            sTime[i] = (double) (target-sPosition[i]) / sSpeed[i];
        }

        for (double i : sTime){
            while(!stack.isEmpty() && i>=stack.peek()){
                stack.pop();
            }
            stack.push(i);
        }
        return stack.size();
    }
}
