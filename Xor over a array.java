//id-1486.// 

// XOR Operation in an Array //

class Solution {
    public int xorOperation(int n, int start) {
        int result=0;
        int nums[] =new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=start+(2*i);
            result =result ^ nums[i];
        }    
        return result;

    }
}