class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> rowMin = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int rMin = Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++) {
                rMin = Math.min(rMin,matrix[i][j]);
            }
            rowMin.add(rMin);
        }

        ArrayList<Integer> colMax = new ArrayList<>();
        for(int i=0;i<matrix[0].length;i++) {
            int cMax = Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++) {
                cMax = Math.max(cMax,matrix[j][i]);
            }
            colMax.add(cMax);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if(matrix[i][j] == rowMin.get(i) && matrix[i][j] == colMax.get(j)) {
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}