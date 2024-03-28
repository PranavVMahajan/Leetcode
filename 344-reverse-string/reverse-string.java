import java.util.Stack;

class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st = new Stack<>();
        int idx = 0;
        while(idx < s.length) {
            st.push(s[idx]);
            idx++;
        }
        idx = 0;
        while(!st.isEmpty()) {
            s[idx] = st.pop();
            idx++;
        }
    }
}