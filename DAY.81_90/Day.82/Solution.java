class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        result.add(new ArrayList<>()); 
        for (int num : nums) {
            List<List<Integer>> Subset1 = new ArrayList<>();
            for (List<Integer> subset : result) {
                List<Integer> Subset2 = new ArrayList<>(subset);
                Subset2.add(num);
                Subset1.add(Subset2);
            }
            result.addAll(Subset1);
        }
        return new ArrayList<>(result);
    }
}
