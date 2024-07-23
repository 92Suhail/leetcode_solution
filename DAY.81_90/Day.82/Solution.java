import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int totalSubsets = 1 << n; 
        Set<List<Integer>> set = new HashSet<>();
        for (int mask = 0; mask < totalSubsets; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) > 0) {
                    subset.add(nums[i]);
                }
            }
            set.add(subset);
        }
        result.addAll(set);
        return result;
    }
}
