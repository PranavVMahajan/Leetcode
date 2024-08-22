class Solution {
    public int findComplement(int num) {
       if( num == 1) return 0;
       int len = (int)(Math.log(num) / Math.log(2)) + 1;
       int mask = (1<<len) -1;
       return mask^num;

    }
}