// 3099 - Harshad Number//
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
       int num = x;
       int sum =0;
       while(x!=0){
        sum = sum+(x%10);
        x = x/10;
       } 
       if(num%sum==0){
        return sum;
       }
       else {
        return -1;
       }
       
    }
}