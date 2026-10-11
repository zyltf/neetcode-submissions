class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> seen = new ArrayList<>();
        for (int i=0; i < nums.length; i++) {
            int wanted = target-nums[i];
            if (seen.contains(wanted)) {
                return new int[]{seen.indexOf(wanted),i};
            }
            seen.add(nums[i]);
        }
        return new int[]{0,0};
    }
}
