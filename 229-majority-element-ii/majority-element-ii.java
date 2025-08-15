class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int ap = nums.length/3;
        for(Map.Entry<Integer,Integer> ent : map.entrySet()){
            if(ent.getValue()> ap){
                ans.add(ent.getKey());
            }
        }
        return ans;
    }
}