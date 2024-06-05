class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }
        
        return totalSum - arraySum;
    }
}
