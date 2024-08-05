class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        boolean isTwice = false; 
        for (int i=0; i < len; i++) { 
         isTwice = false;
         for (int j=0; j<len; j++) {
          if (isTwice) break;
          if (i != j)
               if(nums[i] == nums[j]) 
                    isTwice = true;
         }         
          if(!isTwice) return nums[i];
         }
         return nums[len - 1];
    }
}