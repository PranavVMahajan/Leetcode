class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        int teams = n/2;
        int totalSum = 0;
        int map[] = new int[1001];
        for(int element : skill) {
            map[element]++;
            //freqMap.put(element,freqMap.getOrDefault(element,0)+1);
            totalSum += element;
        }
        if(totalSum%teams !=0) {
            return -1;
        }
        int targetPoints = totalSum/teams;
        long res = 0;
        for(int element : skill) {
            if(map[element]==0) {
                continue;
            }
            map[element]--;
            int partner = targetPoints - element;
            if(map[partner] == 0) {
                return -1;
            }
            map[partner]--;
            res = res + ((long)element * (long) partner);
        }
        return res;
    }
}