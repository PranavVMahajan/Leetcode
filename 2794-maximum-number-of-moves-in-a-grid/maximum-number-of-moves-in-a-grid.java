class Solution {
    int m; // rows
    int n; // cols
    int[] directions = {-1, 0, 1};

    public int DFS(int row, int col, int[][] grid, int[][] t) {
        if (t[row][col] != -1) {
            return t[row][col];
        }

        int moves = 0;

        for (int dir : directions) {
            int newRow = row + dir;
            int newCol = col + 1;

            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && grid[newRow][newCol] > grid[row][col]) {
                moves = Math.max(moves, 1 + DFS(newRow, newCol, grid, t));
            }
        }

        t[row][col] = moves;
        return moves;
    }

    public int maxMoves(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int result = 0;

        int[][] t = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = -1; // Initialize the memoization array with -1
            }
        }

        for (int row = 0; row < m; row++) {
            result = Math.max(result, DFS(row, 0, grid, t));
        }

        return result;
    }
}
