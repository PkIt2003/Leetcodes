public class Check1and2bit {
        public boolean isOneBitCharacter(int[] bits) {
            // id-717. 1-bit and 2-bit Characters
            boolean bit2 = true;
            for(int i=0;i<=bits.length-1;i++){
                if(bits[i]==1){
                    if(i+1==bits.length-1){
                        bit2 = false;
                        break;
                    }
                    i++;
                }
            }
            return bit2;
        }   
}
