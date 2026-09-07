class Solution {

    static void checkString(String s) {
        int v = 0;
        int c = 0;

        // code here
        char [] arr= s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(arr[i]=='a'|| arr[i]=='e'|| arr[i]=='o'||arr[i]=='u'||arr[i]=='i'){
                v++;
            }
            else {
                c++;
            }
        }
        if(v>c){
            System.out.println("Yes");
        }
        else if(v<c){
            System.out.println("No");
        }
        else{
            System.out.println("Same");
        }
    }
}