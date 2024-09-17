class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();

        for(String word : s1.split(" ")) {
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String word : s2.split(" ")) {
            map.put(word,map.getOrDefault(word,0)+1);
        } 
        ArrayList<String> arr = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                arr.add(entry.getKey());
            }
        }
        String res[] = new String[arr.size()];

        for(int i=0;i<res.length;i++) {
            res[i]=arr.get(i);
        }
        return res;
    }
}