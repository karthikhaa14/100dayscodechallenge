class Solution {
    public String largestOddNumber(String num) {
        String str="";
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)%2!=0){
                str=num;
                break;
            }
            else{
                num=num.substring(0,i);
            }
        }
        return str;
    }
}
