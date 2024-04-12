class Solution {
    public String finalString(String s) {
        int n = s.length();
        StringBuilder ch = new StringBuilder();
        for(int i = 0;i<n;i++) {
            if(s.charAt(i)=='i') {
                ch.reverse();
            }
            else {
                ch.append(s.charAt(i));
            }
        }
        return ch.toString();
    }
}