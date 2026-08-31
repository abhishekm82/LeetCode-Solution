class Solution {
    public void moveZeroes(int[] nums) {
        int nz = 0;
        int z = 0;
        while(nz < nums.length){
            if(nums[nz] != 0){
                swap(nums, nz, z);
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}