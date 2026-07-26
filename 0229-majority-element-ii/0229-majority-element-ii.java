class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
    
        int n = nums.length;
        Arrays.sort(nums);

        if(nums.length <= 2){
            for(int num : nums){
                if(!ans.contains(num)){
                    ans.add(num);
                }
            }
            return ans;
        }
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count == (n / 3) + 1 && !ans.contains(nums[i])){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}