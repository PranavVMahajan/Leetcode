class Solution {
    ArrayList<int[]> result = new ArrayList<>();

    public int[][] findFarmland(int[][] land) {
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if (land[i][j] == 1) {
                    int[] coordinates = {i, j, i, j};
                    helper(land, i, j, coordinates);
                    result.add(coordinates);
                }
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public void helper(int[][] land, int x, int y, int[] coordinates) {
        if (x < 0 || y < 0 || x >= land.length || y >= land[0].length || land[x][y] != 1) return;
        land[x][y] = 2;
        coordinates[0] = Math.min(coordinates[0], x);
        coordinates[1] = Math.min(coordinates[1], y);
        coordinates[2] = Math.max(coordinates[2], x);
        coordinates[3] = Math.max(coordinates[3], y);
        helper(land, x + 1, y, coordinates);
        helper(land, x - 1, y, coordinates);
        helper(land, x, y + 1, coordinates);
        helper(land, x, y - 1, coordinates);
    }
}