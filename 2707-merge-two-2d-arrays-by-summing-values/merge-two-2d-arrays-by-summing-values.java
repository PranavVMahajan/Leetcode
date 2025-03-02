class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int p1 = 0;
        int p2 = 0;
        List<int[]> result = new ArrayList<>();

        while(p1<nums1.length && p2<nums2.length) {
            int id1 = nums1[p1][0] , val1 = nums1[p1][1];
            int id2 = nums2[p2][0] , val2 = nums2[p2][1];

            if(id1<id2) {
                result.add(new int[]{id1,val1});
                p1++;
            }
            else if(id2<id1) {
                result.add(new int[]{id2,val2});
                p2++;
            }
            else {
                result.add(new int[]{id1,val1+val2});
                p1++;
                p2++;
            }
        }

        while(p1<nums1.length) {
            result.add(nums1[p1]);
            p1++;
        }

        while(p2<nums2.length) {
            result.add(nums2[p2]);
            p2++;
        }

        int ans[][] = new int[result.size()][2];
        for(int k =0;k<result.size();k++) {
            ans[k] = result.get(k);
        }

        return ans;
    }
}