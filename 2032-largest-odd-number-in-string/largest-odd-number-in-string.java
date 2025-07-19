class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder(num);
        while (sb.length() > 0) {
            char last = sb.charAt(sb.length() - 1);
            if ((last - '0') % 2 == 1) {
                return sb.toString();
            }
            sb.setLength(sb.length() - 1);
        }
        return "";
    }
}