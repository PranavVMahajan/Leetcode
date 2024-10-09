class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0; 
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop(); 
                } else {
                    count++; 
                }
            }
        }
        return stack.size() + count;
    }
}