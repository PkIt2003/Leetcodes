public class UglyNumber {
        public boolean isUgly(int n) {
            // id-263. Ugly Number
            boolean boo = true;
            if(n==1){
                boo = true;
            }
            else if(n==0){
                boo = false;
            }
            else{
                while(n!=0){
                    if(n%2==0){
                        n = n/(2);
                        if(n==1){
                            boo = true;
                            break;
                        }
                    }
                    else if(n%3==0){
                        n = n/(3);
                        if(n==1){
                            boo = true;
                            break;
                        }
                    }
                    else if(n%5==0){
                        n = n/(5);
                        if(n==1){
                            boo = true;
                            break;
                        }
                    }
                    else if(n%2!=0 || n%3!=0 || n%5!=0){
                        boo = false;
                        break;
                    }
                }
            }
            return boo;
        }
}
