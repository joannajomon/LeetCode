class Solution {
    public String reverseWords(String s) {
        String words[]=s.trim().split(" "); // trims the trailing spaces and split the words
        StringBuilder res= new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
        if(words[i].isEmpty())
        continue;   //if empty continue with the loop
        res.append(words[i]);
        if(i!=0)
        res.append(" "); //add a space except for the last word
        }
        return res.toString(); 
     }
}