class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        for(char ch : s.toCharArray()) {
            if(set.contains(ch)) {
                res +=2;
                set.remove(ch);
            }
            else {
                set.add(ch);
            }
        }
        if(set.size()>0) {
            res += 1;
        }
        return res;
    }
}