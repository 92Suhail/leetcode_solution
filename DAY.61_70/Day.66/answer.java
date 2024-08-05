class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentP = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, currentP, result);
        return result;
    }
    private void backtrack(int[] nums, boolean[] used, List<Integer> currentP, List<List<Integer>> result) {
        if (currentP.size() == nums.length) {
            result.add(new ArrayList<>(currentP));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                currentP.add(nums[i]);
                backtrack(nums, used, currentP, result);
                used[i] = false;
                currentP.remove(currentP.size() - 1);
            }
        }
    }
}
