class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftOperation = new int[nums.length];
        int[] rightOperation = new int[nums.length];
        int suffix=1;
        int prefix=1;

        for (int i=0; i<nums.length; i++){
            leftOperation[i] = prefix;
            rightOperation[nums.length-i-1] = suffix;
            prefix *= nums[i];
            suffix *= nums[nums.length-i-1];
            
        }

        for (int i=0; i<nums.length; i++){
            rightOperation[i] *= leftOperation[i];
        }
        
        return rightOperation;
    }
}  
