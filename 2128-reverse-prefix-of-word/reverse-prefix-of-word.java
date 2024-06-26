class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if(idx == -1) {
            return word; 
        }
       
        for(int i = 0;i<word.length();i++) {
            if(word.charAt(i) == ch) {
                StringBuilder sb = new StringBuilder(word.substring(0,i+1));
                return sb.reverse().toString() + word.substring(i+1);
            }
        }
        return word;
    }
}