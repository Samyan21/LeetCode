class Solution {
    public int calculate(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        int num = 0;
        char op = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
                switch (op) {
                    case '+': 
                        stack.push(num); 
                        break;
                    case '-': 
                        stack.push(-num);
                        break;
                    case '*': 
                        stack.push(stack.pop() * num); 
                        break;
                    case '/':
                        stack.push(stack.pop() / num); 
                        break;
                }
                op = c;
                num = 0;
            }
        }
        int result = 0;
        for (int x : stack)
            result += x;
        return result;
    }
}