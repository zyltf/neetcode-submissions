class MinStack {
    Deque<Integer> stack;
    PriorityQueue<Integer> pq;
    
    public MinStack() {
        this.pq = new PriorityQueue<>();
        this.stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        pq.add(val);
        stack.push(val);
    }
    
    public void pop() {
        pq.remove(stack.pop());

    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return pq.peek();
    }
}
