class Solution {
    int rows;
    int cols;
    public int getMaximumGold(int[][] grid) {
       rows = grid.length;
       cols = grid[0].length;
       int totalGold = 0;
       for(int i = 0;i<rows;i++) {
            for(int j = 0;j<cols;j++) {
                totalGold += grid[i][j];
            }
       }
       int maxGold = 0;
       boolean visited[][] = new boolean[rows][cols];
       for(int i = 0;i<rows;i++){
            for (int j=0;j<cols;j++) {
                if(grid[i][j] != 0) {
                    maxGold = Math.max(maxGold,dfs(i,j,grid,visited));
                    if(maxGold == totalGold) {
                        return totalGold;
                    }
                }
            }
       }
       return maxGold; 
    }
    public int dfs(int row,int col,int[][] grid,boolean visited[][]) {
        //out of bound case ,visited case, 0 gold case
        if(row<0 || row>=rows || col<0 || col>=cols || grid[row][col]==0 || visited[row][col]) {
            return 0;
        }
        visited[row][col] = true;
        int maxGold = 0;
        //try all possiblity
        int dir[][] = new int[][]{{-1,0},{0,1},{1,0},{0,-1}};
        for(int i =0;i<4;i++) {
            int nexRow = row+dir[i][0];
            int nexCol = col+dir[i][1];
            maxGold =Math.max(maxGold,dfs(nexRow,nexCol,grid,visited));
        }
        visited[row][col] = false;
        return grid[row][col] + maxGold;

    }
}