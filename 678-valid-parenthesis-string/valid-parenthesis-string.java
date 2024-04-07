class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> sb = new Stack();
        Stack<Integer> ast = new Stack();
        for(int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                sb.push(i);
            }
            else if (ch == '*' ) {
                ast.push(i);
            }
            else {
                //closing bracket 
                if(!sb.isEmpty()) {
                    sb.pop();
                }
                else if (!ast.isEmpty()) {
                    ast.pop(); // * is treated as (
                }
                else {
                    return false;
                }
            }
        }
        while(!sb.isEmpty()) {
            if(ast.isEmpty()) {
                return false;
            }
            int openIdx = sb.pop();
            int closeIdx = ast.pop();
            if(openIdx>closeIdx) {
                return false;
            }
        }
        return sb.isEmpty();
    }
}