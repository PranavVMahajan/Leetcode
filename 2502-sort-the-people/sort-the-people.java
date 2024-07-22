class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i<names.length;i++) {
            map.put(heights[i],names[i]);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,Collections.reverseOrder());
        
        String[] ans = new String[heights.length];

        int num = 0;
        for(int i : list) {
            ans[num] = map.get(i);
            num++;
        }
        return ans; 
    }
}