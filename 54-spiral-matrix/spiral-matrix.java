class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int stRow = 0;
        int stCol = 0;
        int endRow = m-1;
        int endCol = n-1;
        ArrayList<Integer> arr=new ArrayList<Integer>();

        while(stRow<=endRow && stCol<=endCol){
            
            //TOP to left
            for(int j = stCol;j<=endCol;j++){
                arr.add(matrix[stRow][j]);
            }

            //RIGHT to down 
            for(int j=stRow+1;j<=endRow;j++){
                arr.add(matrix[j][endCol]);
            }

            //LEFT to right
            for(int j=endCol-1;j>=stCol;j--){
                if(stRow == endRow) break;
                arr.add(matrix[endRow][j]);
            }

            //BOTTOM to top
            for(int j=endRow-1;j>=stRow+1;j--){
                if(stCol==endCol) break;
                arr.add(matrix[j][stCol]);
            }
            stRow++;
            stCol++;
            endRow--;
            endCol--;
        }
        return arr;
        
    }
}