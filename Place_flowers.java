public class Place_flowers {
        // id-605. Can Place Flowers
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            boolean boo = false;
            for (int i = 0; i < flowerbed.length; i++) {
                int j = i + 1;
                if (n == 0) {
                    boo = true;
                    break;
                }
                if (flowerbed[i] == 0 && i == 0) {
                    if (flowerbed.length == 1 || flowerbed[j] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                } 
                else if (flowerbed[i] == 0 && i == flowerbed.length - 1) {
                    if (flowerbed[i - 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                } 
                else if (flowerbed[i] == 0 && i != 0 && i != flowerbed.length - 1) {
                    if (flowerbed[i - 1] == 0 && flowerbed[j] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                } 
            }
            return n == 0;
        }
}
