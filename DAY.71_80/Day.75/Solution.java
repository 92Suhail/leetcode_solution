class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0; 
        int right = n - 1; 
        int curr = 0; 
        while (curr <= right) {
            if (nums[curr] == 0) {
                swap(nums, curr, left);
                left++;
                curr++;
            } else if (nums[curr] == 2) {
                swap(nums, curr, right);
                right--;
            } else {
                curr++;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
