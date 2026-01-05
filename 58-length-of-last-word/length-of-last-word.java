class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            --i;
        }
        final int lastInd=i;
        while(i>=0 && s.charAt(i)!=' '){
            --i;
        }
        return lastInd-i;
    }
}