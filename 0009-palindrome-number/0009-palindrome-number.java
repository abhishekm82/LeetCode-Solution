class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        })
        int x_cpy = x;
        int sum = 0;
        while(x_cpy != 0){
            int digit = x_cpy % 10;
            sum = sum * 10 + digit;
            x_cpy /= 10;
        }
        return (sum == x);
    }
}