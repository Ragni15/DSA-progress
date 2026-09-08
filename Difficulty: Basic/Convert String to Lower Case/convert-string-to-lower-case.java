class Solution {
    static String toLower(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<=sb.length()-1;i++){
            char ch = sb.charAt(i);
            if(ch>='A'&&ch<='Z'){
                ch = (char)(ch+32);
            }
            sb.setCharAt(i,ch);
        }
        return sb.toString();
    }
}