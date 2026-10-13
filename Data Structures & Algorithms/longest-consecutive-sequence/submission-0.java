class Solution {
    public int longestConsecutive(int[] nums) {
        int[] sorted = nums;
        Arrays.sort(sorted);

        if (nums.length <= 0) return 0;

        int longest_streak = 1;
        int current_streak = 0;
        int expected = nums[0];

        for (int i: sorted) {
            if (i == expected-1) continue;

            if(i == expected) current_streak +=1;
            else current_streak = 1;


            if (current_streak > longest_streak) {
                longest_streak = current_streak;
            }

            expected = i + 1;
        }
        return longest_streak;
    }
}
