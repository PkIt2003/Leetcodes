public class ArrangeCoins {
        public int arrangeCoins(int n) {
            // id - 441. Arranging Coins
            int stair =0;
            int staircount =1;
            while(n>=staircount){
                n = n-staircount;
                staircount++;
                stair++;
            }
            return stair; 
        }
}
