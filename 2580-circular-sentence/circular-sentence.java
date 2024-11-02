class Solution {
    public boolean isCircularSentence(String sentence) {
        int sz = sentence.length();
        if (sentence.charAt(0) != sentence.charAt(sz - 1)) return false;

        for (int i = 1; i < sz; i++) {
            if (sentence.charAt(i) == ' ') {
                if (sentence.charAt(i - 1) != sentence.charAt(i + 1)) return false;
            }
        }

        return true;
    }
}
