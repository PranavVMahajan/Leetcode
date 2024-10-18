class Solution {
    public int getMax(String s, int i) {
        int maxi = i;
        for (int j = i; j < s.length(); j++) {
            if (s.charAt(maxi) <= s.charAt(j)) {
                maxi = j;
            }
        }
        return maxi;
    }

    public int maximumSwap(int num) {
        String str = Integer.toString(num);
        int n = str.length();

        char[] s = str.toCharArray();

        for (int i = 0; i < n; i++) {
            int temp = getMax(str, i);

            // Swap the characters
            char tempChar = s[i];
            s[i] = s[temp];
            s[temp] = tempChar;

            String newStr = new String(s);
            if (!newStr.equals(str)) {
                break;
            }
        }
        int ans = Integer.parseInt(new String(s));
        return ans;
    }
}
