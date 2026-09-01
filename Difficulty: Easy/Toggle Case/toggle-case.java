class Solution {
    public String toggleCase(String s) {
        // code here
        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(arr[i]>=65 && arr[i]<=90){
                arr[i]=(char)(arr[i]+32);
            }
            else{
                arr[i]=(char)(arr[i]-32);
            }
        }
        
        return new String(arr);
    }
}
