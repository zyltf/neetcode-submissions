class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l=0, res=0, r;

        for (r=0; r<s.length(); r++) {
            char c = s.charAt(r);
            if(map.containsKey(c) && l<=map.get(c)) {
                l = map.get(c) + 1;
            }
            map.put(c, r);
            res = Math.max(r-l+1, res);

        }
        return res;
    }
}
