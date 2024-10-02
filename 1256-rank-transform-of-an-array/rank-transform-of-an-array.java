class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int n = arr.length;
       ArrayList<Integer> indexArr = new ArrayList<>();
       for(int i = 0;i<n;i++) {
          indexArr.add(i);
        }
        Collections.sort(indexArr, new Comparator<Integer>() {
          public int compare(Integer x, Integer y) {
                return arr[x] - arr[y]; 
          }
        });
       int rank = 0;
       int prev = Integer.MAX_VALUE;
       int ans[] = new int[n];
       for(int idx : indexArr) {
            if(prev != arr[idx]) {
                prev = arr[idx];
                rank++;
            }
            ans[idx] = rank;
        }
        return ans;
    }
}