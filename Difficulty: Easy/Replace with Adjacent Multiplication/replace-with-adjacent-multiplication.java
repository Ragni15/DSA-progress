class Solution {
    public void updateArray(int[] arr) {
        // code here
        int n = arr.length;
        int [] temp = new int[n];
        for(int i=0;i<n;i++){
            int left = (i==0)?1:arr[i-1];
            int right = (i==n-1)?1:arr[i+1];
            temp[i]=left*right*arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}