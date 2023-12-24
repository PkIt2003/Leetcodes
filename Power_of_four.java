//id-342.// 

//Power of Four//

class Solution {
    public boolean isPowerOfFour(int n) {
        double power = 0;
        double i=0;
        double b  = 4.0;
        boolean boo = false;
        while(power<=n){
            power = Math.pow(b,i);
            i++;
            if(power==n){
                boo = true;
                break;
            }
        }
        return boo;
    }
}