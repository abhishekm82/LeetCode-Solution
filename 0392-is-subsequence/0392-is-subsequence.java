class Solution {
    public boolean isSubsequence(String s, String t) {
        StringBuilder str = new StringBuilder();
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            while(j < t.length()){
                if(ch == t.charAt(j)){
                    str.append(ch);
                    j++;
                    break;
                }
                j++;
            }
        }
            return s.equals(str.toString());
    }
}