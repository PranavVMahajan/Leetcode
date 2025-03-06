class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = grid.length;
        int vals = n*n;
        int a= -1;
        int b= -1;

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }

        for(int num = 1;num<=vals;num++){
            if(!map.containsKey(num)){
                b = num;
            }
            else if(map.get(num) == 2) {
                a = num;
            }
            else if(a != -1 && b != -1) {
                break;
            }
        }

        return new int[]{a,b};
    }
}