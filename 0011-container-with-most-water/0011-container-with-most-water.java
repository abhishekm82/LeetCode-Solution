class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int eff_area, area;
        int maxArea = 0;
        int result = 0;
        while(l < r){
            eff_area = Math.min(height[l], height[r]);
            area = eff_area * (r - l);
            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
            result = Math.max(maxArea, area);
            maxArea = result;
        }
        return result;
    }
}