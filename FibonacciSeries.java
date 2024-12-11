public class FibonacciSeries {
        // id-509. Fibonacci Number
        public int fib(int n) {
            int sum =0;
            int n1 = 0;
            int n2 =1;
            if(n==1){
                sum = 1;
            }
            else{
            while(n>1){
                sum = n1+n2;
                n1 = n2;
                n2 = sum;
                n--;
            }
            }
            return sum;
        }
    
}
