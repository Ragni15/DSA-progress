class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(sb.toString().equals(s)) return true;
        return false;
    }
}