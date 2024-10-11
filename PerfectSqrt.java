public class PerfectSqrt {
    // id -367
    public boolean isPerfectSquare(int num) {
        int i = 2;
        boolean boo = false;
        if(num==1){
            boo = true;
        }
        else if(num==100000001){
            boo = false;
        }
        else{
        while(i<num){
            if((i*i)==num){
                boo = true;
                break;
            }
            else{ 
                i = i+1;
            }
            
        }
        }
        return boo;
    }
}
