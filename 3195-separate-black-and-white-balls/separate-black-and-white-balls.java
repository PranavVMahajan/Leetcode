class Solution {
    public long minimumSteps(String s) {
        char[] ch = s.toCharArray();
        int n = s.length();
        long ans = 0;
        int zeros = 0;
        for(int i = n-1;i>=0;i--) {
            if(ch[i] == '0') {
                zeros++;
            }
            if(ch[i] == '1') {
                ans += zeros;
            }
        }
        return ans;
    }
}