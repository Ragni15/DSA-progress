import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(!Character.isLetterOrDigit(arr[i])){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(arr[j])){
                j--;
                continue;
            }
            if(Character.toLowerCase(arr[i])!=Character.toLowerCase(arr[j])) return false;
            i++;
            j--;
        }  
        return true; 
    }
}