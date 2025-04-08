class Solution {
    int n ;
    public boolean check(List<Integer> nums,int st){
        Set<Integer> set =  new HashSet<>();
        for(int j=st;j<n;j++){
            if(set.contains(nums.get(j))){
                return false;
            }
            set.add(nums.get(j));
        }
        return true;
    }
    public int minimumOperations(int[] nums) {
        List<Integer> numlist = new ArrayList<>();
        for(int num: nums) numlist.add(num);

        n = numlist.size();
        int ops = 0;
        for(int i=0;i<n;i += 3){
            if(check(numlist,i) == true) {
                return ops;
            }
            ops++;
        }
        return ops;
    }
}