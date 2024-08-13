class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(candidates,target,curr,0,ans);
        return ans;

    }
    public void solve(int[] candidates, int target,List<Integer> curr,int idx,List<List<Integer>> ans) {
        if(target<0) return;
        if(target == 0) {
            ans.add(new ArrayList<>(curr));
            return ;
        }
        for(int i=idx;i<candidates.length;i++) {
            if(i>idx && candidates[i] == candidates[i-1]) {
                continue;
            }


            curr.add(candidates[i]);
            solve(candidates,target-candidates[i],curr,i+1,ans);
            curr.remove(curr.size()-1);
        }
    }
}