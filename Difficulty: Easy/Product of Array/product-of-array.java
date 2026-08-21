class Solution {
    public long product(long arr[]) {
        // code here
        long pro = 1;
        long mod = 1000000007;
        for(int i=0;i<arr.length;i++){
            pro = (pro*arr[i])%mod;
        }
        return pro;
    }
}