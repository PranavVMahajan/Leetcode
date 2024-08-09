class Solution {
    public int findMin(int[] nums) {
       int n = nums.length;
        int l = 0, r = n - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;
            // Compare mid element with the rightmost element to determine the sorted part
            if (nums[mid] > nums[r]) {
                // The minimum is in the right unsorted part
                l = mid + 1;
            } else {
                // The minimum is in the left part including mid
                r = mid;
            }
        }

        // After the loop, l == r and it points to the minimum element
        return nums[l];

    }
}