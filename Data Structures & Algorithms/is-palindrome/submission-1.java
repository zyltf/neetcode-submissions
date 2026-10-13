class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;
        
        while (right > left){
            char leftChar = Character.toLowerCase(s.charAt(left)); 
            char rightChar = Character.toLowerCase(s.charAt(right));

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            if (leftChar != rightChar) return false;
            
            left++;
            right--;
        }
        return true;
    }
}
