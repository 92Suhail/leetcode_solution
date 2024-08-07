class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> res = new ArrayList<>();

        if(n<3){
            return res;
        }
        Arrays.sort(nums);

        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            int target=-(nums[i]);
            int left= i+1;
            int right= n-1;

            while(left<right){
                if(nums[left] + nums[right] < target){
                    left++;

                }
                else if(nums[left] + nums[right] > target){
                    right--;
                }
                else{

                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right &&nums[left]==nums[left+1]) left++;
                    while(left<right &&nums[right]==nums[right-1]) right--;

                        left++;
                        right--;

                }
            }
        }
        return res;
    }
}