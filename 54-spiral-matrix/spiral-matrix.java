class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
         ArrayList<Integer> arr=new ArrayList<Integer>();

        while(startRow<=endRow && startCol<=endCol) {
            //top
            for(int j=startCol;j<=endCol;j++) {
                arr.add(matrix[startRow][j]);
            }

            //Right
            for(int i=startRow+1;i<=endRow;i++) {
                arr.add(matrix[i][endCol]);
            }

            //Bottem
            for(int j=endCol-1;j>=startCol;j--) {
                if(startRow==endRow) {
                    break;
                }
                arr.add(matrix[endRow][j]);
            }

            //Left
            for(int i=endRow-1;i>=startRow+1;i--) {
                if(startCol==endCol) {
                    break;
                }
                arr.add(matrix[i][startCol]);
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return arr; 
    }
}