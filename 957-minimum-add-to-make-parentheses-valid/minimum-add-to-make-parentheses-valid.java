class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0; // To keep track of unmatched closing parentheses
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop(); // Match a closing parenthesis with an opening one
                } else {
                    count++; // Increment count for unmatched closing parentheses
                }
            }
        }
        // The stack will contain the unmatched opening parentheses
        return stack.size() + count;
    }
}