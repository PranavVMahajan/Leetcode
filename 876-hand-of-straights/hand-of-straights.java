class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int num: hand) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        while(!map.isEmpty()) {
            int curr = map.firstKey();
            for(int i=0; i<groupSize; i++) {
                if(!map.containsKey(curr + i)) return false;
                map.put(curr + i, map.get(curr + i) - 1);
                if(map.get(curr + i) < 1) {
                    map.remove(curr + i);
                }
            }
        }
        return true;
    }
}