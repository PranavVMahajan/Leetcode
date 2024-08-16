class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int n = arrays.get(0).size();
        int max = arrays.get(0).get(n-1);
        int ans = 0;
        for(int i=1;i<arrays.size();i++) {
            int m = arrays.get(i).size();
            ans = Math.max(ans,Math.max(max-arrays.get(i).get(0),arrays.get(i).get(m-1)-min));
            max = Math.max(max,arrays.get(i).get(m-1));
            min = Math.min(min,arrays.get(i).get(0));
        }
        return ans;
    }
}