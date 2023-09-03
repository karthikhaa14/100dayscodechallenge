class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0,len=pref.length();
        for(int i=0;i<words.length;i++){
            if(words[i].length()>=len){
                if(words[i].substring(0,len).equals(pref)){
                    count++;
                }
            }
        }
        return count;
    }
}
