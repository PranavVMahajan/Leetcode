class Solution {
    public void reverseString(char[] ch) {
        int start =0;
        int end=ch.length-1;
        while(start<=end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
}