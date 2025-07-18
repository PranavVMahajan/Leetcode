class Solution {
    public String reverseWords(String s) {
        s = s.trim(); 
        Stack<String> st = new Stack<>();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch != ' ') {
                word.append(ch);
            } else if (word.length() > 0) {
                st.push(word.toString());
                word.setLength(0);
            }
        }
        if (word.length() > 0) {
            st.push(word.toString());
        }

        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
            if (!st.isEmpty()) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}