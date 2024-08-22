class Solution {
    public int bitwiseComplement(int n) {
       if( n == 1) return 0;
       int len = (int)(Math.log(n) / Math.log(2)) + 1;
       int mask = (1<<len) -1;
       return mask^n;
    }
}