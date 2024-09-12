import java.util.*;

class Solution {
    public int similarPairs(String[] words) {
        int cnt = 0;
        Map<String, Integer> map = new HashMap<>();
        
        for (String word : words) {
            Set<Character> set = new TreeSet<>();
            
            for (char c : word.toCharArray()) {
                set.add(c);
            }
            
            StringBuilder sb = new StringBuilder();
            for (char c : set) {
                sb.append(c);
            }
            
            String sort= sb.toString();
            if (map.containsKey(sort)) {
                map.put(sort, map.get(sort) + 1);
            } else {
                map.put(sort, 1);
            }
        }
        
        for (int count : map.values()) {
            cnt += (count - 1) * count / 2;
        }
        
        return cnt;
    }
}
