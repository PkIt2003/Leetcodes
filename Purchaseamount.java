class Solution {
    /**
     * @param purchaseAmount
     * @return
     */
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int bal =0;
        if(purchaseAmount<=10){
            if(purchaseAmount<5){
                bal =100-0;
            }
            else{
                bal = 100-10;
            }
        }
        else {
           if(purchaseAmount%10<5){
               while(purchaseAmount%10!=0){
                   purchaseAmount--;
               }
           }
           else{
               while(purchaseAmount%10!=0){
                   purchaseAmount++;
               }
           }
           bal = 100 - purchaseAmount;
        }
        return bal;
    }
}








