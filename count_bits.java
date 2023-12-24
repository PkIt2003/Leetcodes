//id-338// 

//Counting Bits//

class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<n+1;i++){
            arr[i] = Integer.bitCount(i);
        }
        return arr;
    }
}
