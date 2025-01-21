class Solution {
    public long gridGame(int[][] grid) {

        long topSum = 0;
        int n = grid[0].length;
        for(int i=0;i<n;i++) {
            topSum += grid[0][i];
        }

        long bottomSum = 0;
        long ans = Long.MAX_VALUE;
        for(int p =0;p<n;p++) {
            // sub topSum
            topSum -= grid[0][p];
            //find ans
            ans = Math.min(ans,Math.max(topSum,bottomSum));
            //add bottom val
            bottomSum += grid[1][p];
        }
        return ans;
    }
}