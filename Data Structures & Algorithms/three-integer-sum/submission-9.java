class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i=0; i<nums.length-2; i++){
            int left = i+1, right = nums.length-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right] == 0) {
                    List<Integer> triplet = new ArrayList<>(List.of(nums[i], nums[left], nums[right]));
                    if(!res.contains(triplet)) res.add(triplet);
                    left++;
                    right--;
                } else if(nums[i]+nums[left]+nums[right] < 0){
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
    }
}
