class Solution {

    public String encode(List<String> strs) {

        StringBuilder encoded = new StringBuilder();
        encoded.append(String.format("%03d", strs.size()));

        for (String str: strs) {
            encoded.append(String.format("%03d", str.length()))
            .append("&")
            .append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {

        List<String> decodedStrs = new ArrayList<>();
        int first = 3;
        int last;

        for (int i=0; i<Integer.parseInt(str.substring(0, 3)); i++){

            if (Integer.parseInt(str.substring(first, first+3)) == 0) {
                decodedStrs.add("");
                first += 4;
                continue;
            }

            last = first + (Integer.parseInt(str.substring(first, first+3))) +4;
            decodedStrs.add(str.substring(first+4, last));
            first = last;
        }
        
        return decodedStrs;  
    }
}
