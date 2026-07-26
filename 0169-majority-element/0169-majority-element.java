class Solution {
    public int majorityElement(int[] nums) {
        int maxCount = 1, count = 1;
        int ans = nums[0];
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count > maxCount){
                maxCount = count;
                ans = nums[i];
            }
        }
        return ans;
    }
}