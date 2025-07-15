class Solution {
    public String removeOuterParentheses(String s) {
        int cnt = 0;
        boolean flag = true;
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                cnt++;
            }
            else if(s.charAt(i) == ')'){
                cnt--;
            }

            if(cnt == 1 && flag == true) {
                flag = false;
                continue;
            }
            else if (cnt == 0 && flag == false){
                flag = true;
                continue;
            }
            ans +=  s.charAt(i);
        }
        return ans;
    }
}