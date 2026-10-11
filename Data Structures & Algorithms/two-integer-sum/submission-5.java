class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i=0; i < nums.length; i++) {
            int wanted = target-nums[i];
            if (seen.containsKey(wanted)) {
                return new int[]{seen.get(wanted),i};
            }
            seen.put(nums[i], i);
        }

        return new int[]{};
    }
}
