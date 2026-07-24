class Solution {
    public int lengthOfLastWord(String s) {
        String[] s_cpy = s.split(" ");
        return s_cpy[s_cpy.length -1].length();
    }
}