class Solution {
    public String restoreString(String s, int[] indices) {
        char[] st=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            st[indices[i]]=s.charAt(i);
        }
        String str=new String(st);
        return str;
    }
}
