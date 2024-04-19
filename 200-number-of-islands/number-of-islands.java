class Solution {
    int m = 0;
    int n = 0;
    public int numIslands(char[][] grid) {
        int count = 0;
        m = grid.length;
        n = grid[0].length;
        for(int i = 0;i<m;i++) {
            for(int j = 0;j<n;j++) {
                if(grid[i][j] == '1') {
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid,int i ,int j) {
        //out of bound
        if(i<0 || i>=m || j<0 || j>=n) {
            return;
        }
        //water or visited
        if(grid[i][j] == '0' || grid[i][j] == '2') {
            return;
        }
        grid[i][j] = '2';
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
    }
}