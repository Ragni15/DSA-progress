
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int count = 0;
        int n = arr.size();
        for(int i=0;i<n;i++){
            if(arr.get(i)<=x){
                count++;
            }
        }
        return count;
    }
}