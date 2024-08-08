class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        int[][] res = new int[rows*cols][2];
        res[0] = new int[]{rStart,cStart};
        int count = 1;
        int step = 1;
        int index = 0;
        while(count<rows*cols) {
            for(int times =0;times<2;times++) {
                int dr = directions[index%4][0];
                int dc = directions[index%4][1];
                for(int i=0;i<step;i++) {
                    rStart += dr;
                    cStart += dc;
                    if(rStart >= 0 && rStart<rows && cStart>=0 && cStart<cols) {
                        res[count][0] = rStart;
                        res[count][1] = cStart;
                        count++;
                    }
                }
                index++;
            }
            step++;
        }
        return res;
    }
}