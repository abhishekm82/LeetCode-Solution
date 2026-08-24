class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n + 1];
        return dynamicP(n, dp);
    }
    public int dynamicP(int n, int[] dp){
        if(n <= 1){
            return n;
        }
        if(n == 2){
            return 1;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = dynamicP(n - 1, dp) + dynamicP(n - 2, dp) + dynamicP(n - 3, dp);
        return dp[n];
    }
}