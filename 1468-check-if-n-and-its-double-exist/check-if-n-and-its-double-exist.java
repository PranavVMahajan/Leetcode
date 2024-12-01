class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // If 2 * arr[i] is already in the set, return true
            if (set.contains(arr[i] * 2)) {
                return true;
            } 
            // If arr[i] is even and arr[i] / 2 is in the set, return true
            else if (arr[i] % 2 == 0 && set.contains(arr[i] / 2)) {
                return true;
            }
            // Add the current element to the set
            set.add(arr[i]);
        }

        return false;
    }
}