import java.util.*;
class Solution {
    boolean isPalindrome(String s) {
        // code here
        String og = s;
        String st = new StringBuilder(s).reverse().toString();
        if(st.equals(og)) return true;
        return false;
    }
}