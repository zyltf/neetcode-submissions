class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, Integer> wordMap = new HashMap<>();

        for (String s: strs){

            char[] sortedChars = s.toCharArray();
            Arrays.sort(sortedChars);
            String sortedWord = new String(sortedChars);

            if (wordMap.containsKey(sortedWord)) {
                result.get(wordMap.get(sortedWord)).add(s);
            } else {
                wordMap.put(sortedWord, result.size());
                result.add(new ArrayList<>(List.of(s)));
            }
        }
        return result;
    }
}