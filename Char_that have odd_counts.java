class Solution {
    public String generateTheString(int n) {
        char ch = 'a';
        String fin = "";
        if(n%2!=0){
            while(n!=0){
                fin = fin+ch;
                n--;
            }
        }
        else{
            int i=n-1;
            while(i!=0){
                fin =fin+ch;
                i--;
            }
            fin =fin+'b';
        }
        return fin;
        
    }
}