class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        int i = 0;
        while(i < nums.length - k){
            if(nums[i] == 0){
                for(int j = i; j < nums.length-1-k; j++){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                k++;
            }
            i++;
            if(nums[i-1] == 0){
                i--;
            }
        }
    }
}