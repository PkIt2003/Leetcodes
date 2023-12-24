//id-9.// 

// Palindrome Number//

class Solution {
    public boolean isPalindrome(int x) {
     String str = String.valueOf(x);
     String rstr="";
     int i;
     boolean boo=false;
     if(x==0){
         boo =true;
     }
     else if(x<0){
         boo=false;
     }
     else{
     while(x>0){
         i = x%10;
         rstr = rstr+(String.valueOf(i));
         x=x/10;
     }
     if(str.equals(rstr)==true){
         boo=true;
     }
     }
     return boo;  
    }
}