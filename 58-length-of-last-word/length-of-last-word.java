class Solution {
    public int lengthOfLastWord(String s) {
        //char[] arr= s.toCharArray(); to convert individual letters into array
        String[] words=s.trim().split("\\s+"); //.split() removes the rest of the spaces as well
        return words[words.length-1].length();
    }
}