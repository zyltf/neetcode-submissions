class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c: s.toCharArray()){
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                if (stack.isEmpty()) return false;

                switch(c){
                    case ')': {
                        if ('(' != stack.pop()) return false;
                        break;
                    }
                    case '}': {
                        if ('{' != stack.pop()) return false;
                        break;
                    }
                    case ']': {
                        if ('[' != stack.pop()) return false;
                        break;
                    }
                }
            }
            
        }
        return stack.isEmpty();
    }
}
