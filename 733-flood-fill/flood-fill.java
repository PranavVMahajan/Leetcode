class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        if(original !=color){
            dfs(sr,sc,image,original,color);
        }
        return image;
    }

    public void dfs(int i, int j,int[][] image,int original, int color){
        int m = image.length;
        int n = image[0].length;
        if(i<0 || i>=m || j<0 || j>=n|| image[i][j] != original) return;
        image[i][j] = color;
        dfs(i+1,j,image,original,color);
        dfs(i,j+1,image,original,color);
        dfs(i-1,j,image,original,color);
        dfs(i,j-1,image,original,color);
    }
}