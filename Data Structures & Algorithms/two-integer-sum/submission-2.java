class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> seen = new ArrayList<>();
        for (int i=0; i < nums.length; i++) {
            if (seen.contains(target-nums[i])) {
                return new int[]{seen.indexOf(target-nums[i]),i};
            }
            seen.add(nums[i]);
        }
        return new int[]{0,0};
    }
}
