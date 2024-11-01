public class DeletedCaptial {
        // id - 520. Detect Capital
        public boolean detectCapitalUse(String word) {
            boolean boo = false;
            if(word.equals(word.toUpperCase())){
                boo = true;
            }
            else if(word.equals(word.toLowerCase())){
                boo = true;
            }
            else if(Character.isUpperCase(word.charAt(0))){
                for(int i=1;i<=word.length()-1;i++){
                    if(Character.isUpperCase(word.charAt(i))){
                        boo = false;
                        break;
                    }
                    else{
                        boo = true;
                    }
                }
            }
           
            return boo;
        }
}
