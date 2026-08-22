class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int max=arr[0];
        int secondmax=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max){
                secondmax=arr[i];
            }
        }
        return secondmax;
    }
}