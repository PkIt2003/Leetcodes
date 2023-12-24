//id-258.// 

//Add Digits//

class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while(num>0){
            sum = num%10;
            num = num/10;
            sum +=num;
            if(sum>9){
                num =sum;
            }
            else{
                break;
            }
        }
        return sum;

    }
}