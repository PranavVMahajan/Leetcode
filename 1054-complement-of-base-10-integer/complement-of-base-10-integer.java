class Solution {
    public int bitwiseComplement(int n) {
       if(n == 0) return 1;
       int i = 0;
        int result = 0;

        while(n != 0) {
            if((n & 1) == 0) {
                result |= (1 << i);
            }
            n >>= 1;
            i++;
        }
        return result;
    }
}