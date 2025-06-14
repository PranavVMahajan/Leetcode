class Solution {
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);

        char[] maxChars = str.toCharArray();
        char maxReplace = 0;
        for(char c:maxChars){
            if(c !='9'){
                maxReplace = c;
                break;
            }
        }
        for (int i = 0; i < maxChars.length; i++) {
            if (maxChars[i] == maxReplace) {
                maxChars[i] = '9';
            }
        }
        int maxVal = Integer.parseInt(new String(maxChars));

        char[] minChars = str.toCharArray();
        char minReplace = 0;
        for (char c : minChars) {
            if (c != '0') {
                minReplace = c;
                break;
            }
        }
        for (int i = 0; i < minChars.length; i++) {
            if (minChars[i] == minReplace) {
                minChars[i] = '0';
            }
        }
        int minVal = Integer.parseInt(new String(minChars));

        return maxVal - minVal;
    }
}