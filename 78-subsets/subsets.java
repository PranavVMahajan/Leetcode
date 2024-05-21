class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        findSubsets(nums,0,new ArrayList<>());
        return res;
    }
    public void findSubsets(int[] nums, int index,List<Integer> sublist) {
        //base case
        if(index == nums.length) {
            res.add(new ArrayList<>(sublist));
            return;
        }
        //pick
        sublist.add(nums[index]);
        findSubsets(nums,index+1,sublist);
        //while backtracking we need to remove last element
        sublist.remove(sublist.size()-1);
        //no pick
        findSubsets(nums,index+1,sublist);
        //since we have not added element so,no need to pick
        // to remove anything while backtracking


    }
}