// id-1346//

//Check If N and Its Double Exist// 

class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean boo =false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                 if(i!=j){
                     if(arr[i]==0 && arr[j]==0){
                         boo = true;
                         break;
                     }
                     else if(arr[i]==2*arr[j]){
                        boo =true;
                        break;
                    }
                    else if(arr[j]==2*arr[i]){
                        boo =true;
                        break;
                    }
                   
                }
            }
        }
        return boo;
    }