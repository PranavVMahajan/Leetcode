class Solution {
    public String customSortString(String order, String s) {
        int arr [] = new int[26];
        for(int i =0;i<s.length();i++) {
            arr[s.charAt(i)-97]++;
        }
        String ans = "";
        for(int i=0;i<order.length();i++) {
            ans +=(""+order.charAt(i)).repeat(arr[order.charAt(i)-97]);
            arr[order.charAt(i)-97] = 0;
        }

        for(int i=0;i<26;i++) {
            ans += (""+(char)(i+97)).repeat(arr[i]);
        }

        return ans;
    }
}