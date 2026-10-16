class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> operators = Set.of("+", "-", "*", "/");
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token: tokens){
            if (operators.contains(token)){
                int num2 = stack.pop(), num1 = stack.pop();

                int res = switch (token) {
                    case "+" -> num1 + num2;
                    case "*" -> num1 * num2;
                    case "/" -> num1 / num2;
                    case "-" -> num1 - num2;
                    default -> num1;
                };
                stack.push(res);

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
