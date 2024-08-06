class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        int n = word.length();
        int row = 1;
        int quotient = n / 8;
        int remainder = n % 8;

        while(quotient>0){
            ans += 8 * row;
            row++;
            quotient--; 
        }
        ans += remainder *row;
        return ans;
    }
}