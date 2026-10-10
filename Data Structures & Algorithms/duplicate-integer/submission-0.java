class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int i: nums) numsSet.add(i);
        if (numsSet.size() == nums.length) return false;
        return true; 
    }
}