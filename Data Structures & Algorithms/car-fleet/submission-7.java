class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Deque<Double> stack = new ArrayDeque<>();

        Integer[] indices = new Integer[n];
        for (int i=0; i<n; i++){
            indices[i] = i;
        }
        Arrays.sort(indices, (i,j) -> Integer.compare(position[i], position[j]));
        

        for (int i=0; i<n; i++){
            double t = (double) (target-position[indices[i]]) / speed[indices[i]];
            while(!stack.isEmpty() && t>=stack.peek()){
                stack.pop();
            }
            stack.push(t);
        }
        return stack.size();
    }
}
