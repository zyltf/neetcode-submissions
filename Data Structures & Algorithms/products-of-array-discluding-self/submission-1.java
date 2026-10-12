class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int suffix=1;
        int prefix=1;

        for (int i=0; i<nums.length; i++){
            result[i] = prefix;
            prefix *= nums[i];
        }

        for (int i=0; i<nums.length; i++){
            result[nums.length-i-1] *= suffix; 
            suffix *= nums[nums.length-i-1];
        }
        
        return result;
    }
}  
