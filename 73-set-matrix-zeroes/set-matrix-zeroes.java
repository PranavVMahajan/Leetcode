class Solution {
    public void setRow(int[][] matrix, int row){
        int cols = matrix[0].length;
        for(int j=0;j<cols;j++){
            matrix[row][j] = 0;
        }
    }
    public void setCol(int[][] matrix,int col){
        int rows = matrix.length;
        for(int i=0;i<rows;i++){
            matrix[i][col] = 0;
        }
    }
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j] == 0){
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        for(int i=0;i<rows;i++){
            if(zeroRows[i]){
                setRow(matrix,i);
            }
        }
        for(int j = 0; j < cols; j++){
            if(zeroCols[j]){
                setCol(matrix, j);
            }
        }
    }
}