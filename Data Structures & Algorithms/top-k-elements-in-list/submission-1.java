class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(count.get(a), count.get(b))
        );
        int[] result = new int[k];
        

        for (int i: nums){
            count.merge(i, 1, Integer::sum);
            
        }
        for (int i : count.keySet()) {
            pq.add(i);
            if (pq.size() > k) pq.poll();
        };
        for (int i=0; !pq.isEmpty(); i++) result[i]=pq.poll();

        return result;
    }  
}
