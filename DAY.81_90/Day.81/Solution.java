class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); 
        for (int num : nums) {
            int currentSize = result.size();
            for (int i = 0; i < currentSize; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i)); 
                subset.add(num); 
                result.add(subset); 
            }
        }
        return result;
    }
}
