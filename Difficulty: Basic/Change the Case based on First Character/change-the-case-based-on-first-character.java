class Solution {
    String modify(String s) {
        StringBuilder sb = new StringBuilder(s);
        char fir = sb.charAt(0);
        if(fir>='A'&&fir<='Z'){
            for(int i=0;i<s.length();i++){
                char ch = sb.charAt(i);
                if(ch>='a'&&ch<='z'){
                    sb.setCharAt(i,(char)(ch-32));
                }
            }
        }
        else{
            for(int i=0;i<s.length();i++){
                char ch = sb.charAt(i);
                if(ch>='A'&&ch<='Z'){
                    sb.setCharAt(i,(char)(ch+32));
                }
            }
        }
        return sb.toString();
    }
}