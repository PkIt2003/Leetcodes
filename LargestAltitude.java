public class LargestAltitude {
        public int largestAltitude(int[] gain) {
            //id-1732. Find the Highest Altitude
            int len = gain.length;
            int arr[] = new int[len+1];
            arr[0] = 0;
            int max =0;
            for(int i=1;i<=len;i++){
                arr[i] = arr[i-1] + gain[i-1];
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            return max;
        }
}
