class Solution {
    public void setR(int[][] matrix, int row){
        int cols = matrix[0].length;
        for(int j=0;j<cols;j++){
            matrix[row][j] = 0;
        }
    }
    public void setC(int[][] matrix, int col){
        int rows = matrix.length;
        for(int i=0;i<rows;i++){
            matrix[i][col] = 0;
        }
    }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        boolean[] zeroRows = new boolean[n];
        boolean[] zeroCols = new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        for(int i=0;i<n;i++){
            if(zeroRows[i]){
                setR(matrix,i);
            }
        }
        for(int j = 0; j < m; j++){
            if(zeroCols[j]){
                setC(matrix, j);
         
            }
        }
    }
}