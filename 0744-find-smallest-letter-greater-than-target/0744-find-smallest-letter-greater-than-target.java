class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, mid, end = letters.length - 1;
        while(start <= end){
            mid = (start + end) / 2;
            if(target < letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}