class Solution {
    public int findTheLongestSubstring(String s) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        
        int bitMask = 0;
        map.put(bitMask, -1);

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a') {
                bitMask ^= (1 << 0);
            }
            else if(ch == 'e') {
                bitMask ^= (1 << 1);
            }
            else if(ch == 'i') {
                bitMask ^= (1 << 2);
            }
            else if(ch == 'o') {
                bitMask ^= (1 << 3);
            }
            else if(ch == 'u') {
                bitMask ^= (1 << 4);
            }

            if(map.containsKey(bitMask)) {
                result = Math.max(result, i - map.get(bitMask));
            }
            else map.put(bitMask, i);
        }
        return result;  
    }
}