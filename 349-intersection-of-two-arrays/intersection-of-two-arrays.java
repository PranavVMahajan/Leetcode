class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int val : nums1) {
            set.add(val);
        }

        for(int val : nums2) {
            if(set.contains(val)) {
                ans.add(val);
                set.remove(val);
            }
        }
        int [] arr = new int [ans.size()];
        for(int i =0;i<ans.size();i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}