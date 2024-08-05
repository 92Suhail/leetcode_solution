class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums == null || nums.length == 0) {
            return result;
        }
        int left = findLeftmostIndex(nums, target);
        if (left == -1) {
            return result;
        }       
        int right = findRightmostIndex(nums, target);
        result[0] = left;
        result[1] = right;
        return result;
    }
    private int findLeftmostIndex(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;     
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else { 
                index = mid;
                high = mid - 1; 
            }
        }
        return index;
    }

    private int findRightmostIndex(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;       
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else { 
                index = mid;
                low = mid + 1; 
            }
        }
        return index;
    }
}
