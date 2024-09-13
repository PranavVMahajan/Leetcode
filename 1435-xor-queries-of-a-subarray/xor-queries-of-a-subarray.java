class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int res[] = new int[queries.length];
        int m = queries.length;
        for(int i=0;i<m;i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            int xor = 0;
            for(int j = left;j<=right;j++) {
                xor ^= arr[j];
            }
            res[i] = xor;
        }
        return res;
    }
}