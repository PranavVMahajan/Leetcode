class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                stack.push(ch);
            } else {
                // Only pop if there's a matching '[' in the stack
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        return (stack.size() + 1) / 2;
    }
}