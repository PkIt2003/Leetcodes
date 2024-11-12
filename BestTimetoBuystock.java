public class BestTimetoBuystock {
        public int maxProfit(int[] prices) {
            //id-121. Best Time to Buy and Sell Stock
            int max =0;
            int intermax =0;
            for(int i=0;i<prices.length;i++){
                for(int j=i+1;j<=prices.length-1;j++){
                    if(prices[i]==0 && prices[j]==0){
                        break;
                    }
                    if(prices[i]>prices[j]){
                        break;
                    }
                    else if(prices[i]<prices[j]){
                        intermax = prices[j]-prices[i];
                        if(intermax>max){
                            max = intermax;
                        }
                    }
                }
            }
            return max;
        }
}
