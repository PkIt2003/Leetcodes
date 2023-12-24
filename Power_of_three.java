//id-326.//

//Power of Three//

class Solution {
    public boolean isPowerOfThree(int n) {
        boolean boo=false;
        if(n==0||n<0){
          boo =false;   
        }
        else if(n==1){
            boo=true;
        }
        else{
        do{
            if(n%3==0){
                n=n/3;
                boo=true;
            }
            else if(n%3!=0){
                boo=false;
                break;
                
            }
        }while(n>1);
        }
        return boo;
    }
}