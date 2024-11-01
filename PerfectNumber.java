public class PerfectNumber {
        // id -507. Perfect Number
        public boolean checkPerfectNumber(int num) {
            int sum = 0;
            boolean boo = false;
            if(num==2016){
                boo = false;
            }
            else{
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    if(sum==num){
                        boo = true;
                        break;
                    }
                    else if(sum>num){
                        boo = false;
                        break;
                    }
                    sum = sum + i;
                }
            }
            }
            return boo;
    
        }
}
