class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Deque<Double> stack = new ArrayDeque<>();

        Integer[] indices = new Integer[n];
        for (int i=0; i<n; i++){
            indices[i] = i;
        }
        Arrays.sort(indices, (i,j) -> Integer.compare(position[i], position[j]));
        
        double[] sTime = new double[n];
        for (int i=0; i<n; i++){
            sTime[i] = (double) (target-position[indices[i]]) / speed[indices[i]];
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
