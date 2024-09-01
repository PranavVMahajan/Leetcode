class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int ans[][] = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c) return mat;
        int arr[] = new int[r*c];
        int idx = 0;
        for(int i =0;i<m;i++) {
            for(int j=0;j<n;j++) {
                arr[idx] = mat[i][j];
                idx++;
            }
        }
        int cnt=0;
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                ans[i][j] = arr[cnt];
                cnt++;
            }
        }
        return ans;
    }
}